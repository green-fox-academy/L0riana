package com.greenfoxacademy.todo_mysql.controller;

import com.greenfoxacademy.todo_mysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  TodoRepository todoRepository;


  @GetMapping({"/", "/list"})
  public String list(Model model, @RequestParam(value = "isActive", required = false) Boolean isActive) {
    if (isActive == null) {
      model.addAttribute("todos", todoRepository.findAll());
    } else {
      model.addAttribute("todos", todoRepository.findBydone(!isActive));
    }
    return "todolist";
  }
}
