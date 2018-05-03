package com.greenfoxacademy.todo_mysql.repository;

import com.greenfoxacademy.todo_mysql.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findByDone(boolean bool);

  Optional<Todo> findById(Long id);

  void deleteById(Long id);

}
