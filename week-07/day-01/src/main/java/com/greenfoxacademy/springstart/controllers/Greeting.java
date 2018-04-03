package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

  AtomicLong id;
  String content;

  public Greeting(AtomicLong id, String content) {
    this.id = id;
    this.content = "Hello, " + content;
  }

  public AtomicLong getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
