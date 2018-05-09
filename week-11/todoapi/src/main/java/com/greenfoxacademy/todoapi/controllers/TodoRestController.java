package com.greenfoxacademy.todoapi.controllers;

import com.greenfoxacademy.todoapi.models.Todo;
import com.greenfoxacademy.todoapi.models.User;
import com.greenfoxacademy.todoapi.services.TodoService;
import com.greenfoxacademy.todoapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoRestController {

  private TodoService todoService;
  private UserService userService;

  @Autowired
  public TodoRestController(TodoService todoService, UserService userService) {
    this.todoService = todoService;
    this.userService = userService;
  }

  @PostMapping("/todo/save")
  public Todo saveTodo(@RequestBody Todo newTodo) {
    return todoService.save(new Todo());
  }

  @GetMapping("todo/list")
  public List<Todo> listTodos() {
    return todoService.findAll();
  }

  @GetMapping("user/list")
  public List<User> listUsers() {
    return userService.findAll();
  }
}
