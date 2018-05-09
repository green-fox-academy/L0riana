package com.greenfoxacademy.todo_rest_api.controllers;

import com.greenfoxacademy.todo_rest_api.models.Todo;
import com.greenfoxacademy.todo_rest_api.models.User;
import com.greenfoxacademy.todo_rest_api.services.TodoService;
import com.greenfoxacademy.todo_rest_api.services.UserService;
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

  @PostMapping("/user/save")
  public User saveUser(@RequestBody User newUser) {
    return userService.save(new User());
  }

  @GetMapping("user/list")
  public List<User> listUsers() {
    return userService.findAll();
  }
}
