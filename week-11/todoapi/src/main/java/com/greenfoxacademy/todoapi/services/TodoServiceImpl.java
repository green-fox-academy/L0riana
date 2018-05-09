package com.greenfoxacademy.todoapi.services;

import com.greenfoxacademy.todoapi.models.Todo;
import com.greenfoxacademy.todoapi.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

  private TodoRepository todoRepository;

  @Autowired
  public TodoServiceImpl(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @Override
  public List<Todo> findAll() {
    return todoRepository.findAll();
  }

  @Override
  public Todo save(Todo todo) {
    return todoRepository.save(todo);
  }
}
