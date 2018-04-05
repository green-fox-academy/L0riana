package com.greenfoxacademy.webapi.color;

import org.springframework.stereotype.Component;

@Component
public class Red implements MyColor {

  @Override
  public void printColor() {
    System.out.println("It is red in color...");
  }
}
