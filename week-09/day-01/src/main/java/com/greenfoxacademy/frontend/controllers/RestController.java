package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.Doubling;
import com.greenfoxacademy.frontend.models.ErrorModel;
import com.greenfoxacademy.frontend.models.GreeterModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @RequestMapping(value = "/doubling", method = RequestMethod.GET)
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    if (input == null) {
      return new ErrorModel();
    } else {
      return new Doubling(input);
    }
  }

  @RequestMapping(value = "/greeter", method = RequestMethod.GET)
  public GreeterModel greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
    if (name == null) {
      return new GreeterModel();
    } else if (title == null) {
      return new GreeterModel(title);
    } else {
      return new GreeterModel(name, title);
    }
  }
}
