package com.greenfoxacademy.todoapi.services;

import com.greenfoxacademy.todoapi.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

  List<User> findAll();

  User save (User user);
}
