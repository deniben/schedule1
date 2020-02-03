package com.test.shedule.controller;

import com.test.shedule.model.Group;
import com.test.shedule.service.GroupService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/groups")
public class GroupController {
    private static final Logger LOGGER = LoggerFactory.getLogger(GroupController.class);
    private GroupService groupService;

    @Autowired
    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping
    public String getAllGroups(Model model) {
        LOGGER.debug("in getAllGroups {}", model);
        List<Group> groups = groupService.findAllGroup();
        model.addAttribute("groups", groups);
        return "index";
    }

    @GetMapping("/addgroup")
    public String addGroup(Model model) {
        model.addAttribute("group", new Group());
        return "addgroup";
    }

    @PostMapping("/saveGroup")
    public String saveGroup(@ModelAttribute("group") Group group, BindingResult result, Model model) {
        if (!result.hasErrors()) {
            groupService.saveGroup(group);
            model.addAttribute("group", group);
        }
        return "index";
    }
}
