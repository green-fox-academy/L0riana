package com.greenfoxacademy.todo_rest_api.repositories;

import com.greenfoxacademy.todo_rest_api.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

  List<User> findAll();

  User save(User user);
}
