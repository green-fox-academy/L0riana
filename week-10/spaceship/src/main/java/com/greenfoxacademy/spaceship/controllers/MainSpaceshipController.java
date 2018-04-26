package com.greenfoxacademy.spaceship.controllers;

import com.greenfoxacademy.spaceship.models.Planet;
import com.greenfoxacademy.spaceship.models.Spaceship;
import com.greenfoxacademy.spaceship.services.SpaceshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainSpaceshipController {

  private SpaceshipService spaceshipService;

  @Autowired
  public MainSpaceshipController(SpaceshipService spaceshipService) {
    this.spaceshipService = spaceshipService;
  }

  @GetMapping("/")
  public String indexPage(Model model) {
    List<Planet> planets = spaceshipService.getAllPlanet();
    Spaceship spaceship = spaceshipService.getSpaceship();
    model.addAttribute("planets", planets);
    model.addAttribute("spaceship", spaceship);
    return "index";
  }
}
