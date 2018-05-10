package com.greenfoxacademy.todo_rest_api.controllers;

import com.greenfoxacademy.todo_rest_api.models.Todo;
import com.greenfoxacademy.todo_rest_api.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoRestController {

    private TodoService todoService;

    @Autowired
    public TodoRestController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping("/todo/save")
    public Todo saveTodo(@RequestBody Todo newTodo) {
        return todoService.save(new Todo());
    }

    @GetMapping("todo/list")
    public List<Todo> listTodos() {
        return todoService.findAll();
    }
}
