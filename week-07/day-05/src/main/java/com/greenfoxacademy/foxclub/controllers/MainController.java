package com.greenfoxacademy.foxclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @RequestMapping(value = "/")
  public String indexPage(@RequestParam(name = "name") String name) {
    return "index";
  }
}
