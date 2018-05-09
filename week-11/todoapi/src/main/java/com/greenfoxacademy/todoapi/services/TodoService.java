package com.greenfoxacademy.todoapi.services;

import com.greenfoxacademy.todoapi.models.Todo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoService {

  List<Todo> findAll();

  Todo save(Todo todo);
}
