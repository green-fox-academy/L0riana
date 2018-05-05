package com.greenfoxacademy.todo_mysql.model;

import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;

@Entity
@Service
public class Assignee {

  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Long assigneeId;
  private String name;
  private String email;

  @OneToMany(mappedBy = "assignee")
  private List<Todo> todos;

  public Assignee() {
  }

  public Assignee(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public Long getAssigneeId() {
    return assigneeId;
  }

  public void setAssigneeId(Long assigneeId) {
    this.assigneeId = assigneeId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Todo> getTodos() {
    return todos;
  }

  public void setTodos(List<Todo> todos) {
    this.todos = todos;
  }
}
