package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
  BankAccount simba = new BankAccount("Simba", 2000, "lion");

  @RequestMapping("/show")
  public String showDetails() {
    return "Accountholder: " + simba.getName() + ", Balance: " + simba.getBalance() + ", Animal type: " + simba.getAnimalType();
  }
}
