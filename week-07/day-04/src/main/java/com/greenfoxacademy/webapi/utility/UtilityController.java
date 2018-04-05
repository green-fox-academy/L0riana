package com.greenfoxacademy.webapi.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.URL;

@Controller
public class UtilityController {

  @Autowired
  UtilityService utilityService;

  @RequestMapping("/useful")
  public String mainPage() {
    return "utilities";
  }

}
