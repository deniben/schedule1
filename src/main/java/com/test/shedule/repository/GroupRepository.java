package com.test.shedule.repository;

import com.test.shedule.model.Group;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface GroupRepository {

    Optional<Group> findByNumber(Long number);

    void save(Group group);

    Optional<Group> findById(Long id);

    void deleteById(Long id);

    List<Group> findAll();
}
