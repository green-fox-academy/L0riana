package com.greenfoxacademy.list;

public class Todo {

  private long id;
  private String title;
  private boolean urgent;
  private boolean done;

  public Todo() {
  }

  public Todo(long id, String title, boolean urgent, boolean done) {
    this.id = id;
    this.title = title;
    this.urgent = false;
    this.done = false;
  }
}
