package com.greenfoxacademy.licenceplate.controllers;

import com.greenfoxacademy.licenceplate.models.LicencePlateResponse;
import com.greenfoxacademy.licenceplate.services.LicencePlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LicencePlateRestController {

  private LicencePlateService licencePlateService;

  @Autowired
  public LicencePlateRestController(LicencePlateService licencePlateService) {
    this.licencePlateService = licencePlateService;
  }

  @GetMapping("/api/search/{brand}")
  public LicencePlateResponse searchByCarBrand(@PathVariable(name = "brand") String carBrand) {
    return new LicencePlateResponse(licencePlateService.getLicencePlatesByCarBrand(carBrand));
  }
}
