package com.greenfoxacademy.licenceplate.controllers;

import com.greenfoxacademy.licenceplate.services.LicencePlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.Size;

@Controller
public class LicencePlateController {

  private LicencePlateService licencePlateService;

  @Autowired
  public LicencePlateController(LicencePlateService licencePlateService) {
    this.licencePlateService = licencePlateService;
  }

  @GetMapping("/")
  public String indexPage(Model model) {
    model.addAttribute("allPlates", licencePlateService.getAllLicencePlate());
    return "search";
  }

  @GetMapping("/search")
  public String searchForLicencePlate(@RequestParam(name = "plate", required = false) String plate, Model model) {
    if (!licencePlateService.validateSearch(plate)) {
      model.addAttribute("error", "The submitted licence plate is not valid.");
      return "search";
    } else {
      model.addAttribute("allPlates", licencePlateService.searchedPlate(plate));
      return "search";
    }
  }

  @GetMapping("/search/{brand}")
  public String searchByBrand(@PathVariable(name = "brand", required = false) String carBrand, Model model) {
    model.addAttribute("allPlates", licencePlateService.getLicencePlatesByCarBrand(carBrand));
    return "search";
  }
}
