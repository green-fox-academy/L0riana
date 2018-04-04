package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class BankController {
  BankAccount bankAccount = new BankAccount("Simba", 2000, "lion");

  @RequestMapping("/show")
  public String showBalance(Model model) {
    model.addAttribute("name", bankAccount.getName());
    model.addAttribute("balance", bankAccount.getBalance());
    model.addAttribute("currency", bankAccount.getCurrency());
    model.addAttribute("animalType", bankAccount.getAnimalType());
    return "bankofsimba";
  }

  @RequestMapping("/showaccounts")
  public String showAllAccount(Model model) {
    ArrayList<BankAccount> bankAccounts = new ArrayList<>(Arrays.asList(
            new BankAccount("Simba", 2000, "lion"),
            new BankAccount("Pumbaa", 900, "warthog"),
            new BankAccount("Timon", 800, "meerkat"),
            new BankAccount("Pumbaa", 700, "horbill"),
            new BankAccount("Rafiki", 600, "mandrill")
    ));
    model.addAttribute("accounts", bankAccounts);
    return "multipleaccounts";
  }
}
