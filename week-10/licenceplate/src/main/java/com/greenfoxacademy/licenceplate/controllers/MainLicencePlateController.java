package com.greenfoxacademy.licenceplate.controllers;

import com.greenfoxacademy.licenceplate.services.LicencePlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainLicencePlateController {

  private LicencePlateService licencePlateService;

  @Autowired
  public MainLicencePlateController(LicencePlateService licencePlateService) {
    this.licencePlateService = licencePlateService;
  }

  @GetMapping("/")
  public String indexPage() {
    return "index";
  }
}
