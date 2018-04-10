package com.greenfoxacademy.todo_mysql.repository;

import com.greenfoxacademy.todo_mysql.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

  public List<Todo> findBydone(boolean bool);

}
