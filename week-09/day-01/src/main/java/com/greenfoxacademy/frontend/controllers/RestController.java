package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.Doubling;
import com.greenfoxacademy.frontend.models.DoublingError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @RequestMapping(value = "/doubling", method = RequestMethod.GET)
  public Object doubling (@RequestParam(value = "input", required = false) Integer input) {
    if (input == null){
      return new DoublingError();
    }else{
      return new Doubling(input);
    }
  }
}
