package com.test.shedule.repository.implementation;

import com.test.shedule.model.Group;
import com.test.shedule.repository.GroupRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Optional;

@Repository
public class GroupRepositoryImpl implements GroupRepository {

    private SessionFactory sessionFactory;

    public GroupRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public Optional<Group> findByNumber(Long number) {

        Session session = sessionFactory.getCurrentSession();
        Query<Group> query = session.createQuery("SELECT g.number FROM groups G where G.number =:number", Group.class);
        query.setParameter("number", number);
        return Optional.of(query.getSingleResult());
    }

    @Override
    public void save(Group group) {
        if (group != null) {
            sessionFactory.getCurrentSession().saveOrUpdate(group);
        }
    }

    @Override
    public Optional<Group> findById(Long id) {
        try {
            return Optional.of(sessionFactory.getCurrentSession().get(Group.class, id));
        } catch (NullPointerException npe) {
            return Optional.empty();
        }
    }

    @Override
    public void deleteById(Long id) {
        Optional<Group> group = findById(id);
        group.ifPresent(value -> sessionFactory.getCurrentSession().delete(value));
    }

    @Override
    public List<Group> findAll() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Group> query = cb.createQuery(Group.class);
        Root<Group> root = query.from(Group.class);
        query.select(root);
        List<Group> groups = session.createQuery(query).getResultList();
        return groups;
    }
}
