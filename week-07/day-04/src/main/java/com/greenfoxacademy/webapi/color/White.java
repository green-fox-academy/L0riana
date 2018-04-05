package com.greenfoxacademy.webapi.color;

import org.springframework.stereotype.Component;

@Component
public class White implements MyColor {

  @Override
  public void printColor() {
    System.out.println("It is white in color...");
  }
}
