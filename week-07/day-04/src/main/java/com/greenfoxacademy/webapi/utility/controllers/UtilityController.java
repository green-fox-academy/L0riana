package com.greenfoxacademy.webapi.utility.controllers;

import com.greenfoxacademy.webapi.utility.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilityController {

  private UtilityService utilityService;

  @Autowired
  public UtilityController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @RequestMapping("/useful")
  public String mainPage() {
    return "utilitylinks";
  }

  @RequestMapping("/useful/colored")
  public String coloredPage(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "backgroundcolor";
  }
}
