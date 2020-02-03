package com.test.shedule.service;

import com.test.shedule.model.Group;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface GroupService {
    void saveGroup(Group group);
    Optional<Group> findById(Long id);
    void deleteById(Long id);
    List<Group> findAllGroup();
}
