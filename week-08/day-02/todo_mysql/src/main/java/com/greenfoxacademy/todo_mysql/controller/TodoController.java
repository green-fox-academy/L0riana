package com.greenfoxacademy.todo_mysql.controller;

import com.greenfoxacademy.todo_mysql.model.Todo;
import com.greenfoxacademy.todo_mysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping(value = "/add")
  public String addTodo() {
    return "addtodo";
  }

  @PostMapping("/add")
  public String addTodo(@RequestParam String title) {
    todoRepository.save(new Todo(title, false, false));
    return "redirect:/todo/list";
  }
}
