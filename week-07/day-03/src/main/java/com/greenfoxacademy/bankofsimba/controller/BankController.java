package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankController {
  BankAccount simba = new BankAccount("Simba", 2000, "lion");

  @RequestMapping("/show")
  public String showBalance(Model model) {
    model.addAttribute("name", simba.getName());
    model.addAttribute("balance", simba.getBalance());
    model.addAttribute("currency", simba.getCurrency());
    model.addAttribute("animalType", simba.getAnimalType());
  return "bankofsimba";
  }
}
