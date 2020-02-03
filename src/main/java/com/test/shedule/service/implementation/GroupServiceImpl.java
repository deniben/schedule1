package com.test.shedule.service.implementation;

import com.test.shedule.model.Group;
import com.test.shedule.repository.GroupRepository;
import com.test.shedule.service.GroupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class GroupServiceImpl implements GroupService {
    private static final Logger LOGGER = LoggerFactory.getLogger(GroupServiceImpl.class);
    private GroupRepository groupRepository;

    @Autowired
    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    public void saveGroup(Group group) {
        if(group != null){
            groupRepository.save(group);
        }

    }

    @Override
    public Optional<Group> findById(Long id) {
        return groupRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        groupRepository.deleteById(id);
    }

    @Override
    public List<Group> findAllGroup() {
        LOGGER.trace("in findAllGroup()");
        List<Group> groups = groupRepository.findAll();
        return groups;
    }
}
