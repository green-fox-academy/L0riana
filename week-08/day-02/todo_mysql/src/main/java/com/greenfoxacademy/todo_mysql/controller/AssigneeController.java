package com.greenfoxacademy.todo_mysql.controller;

import com.greenfoxacademy.todo_mysql.model.Assignee;
import com.greenfoxacademy.todo_mysql.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class AssigneeController {

  private Assignee assignee;
  private AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeController(Assignee assignee, AssigneeRepository assigneeRepository) {
    this.assignee = assignee;
    this.assigneeRepository = assigneeRepository;
  }

  @GetMapping("/assignees")
  public String assignes(Model model) {
    model.addAttribute("assignees", assigneeRepository.findAll());
    return "assignees";
  }

  @GetMapping(value = "/assignees/add")
  public String addAssignees(Model model) {
    model.addAttribute("newAssignee", assignee);
    return "addassignee";
  }

  @PostMapping(value = "/assignees/add")
  public String addedAssignees(@ModelAttribute Assignee newAssignee) {
    assigneeRepository.save(newAssignee);
    return "redirect:/todo/assignees";
  }
}
