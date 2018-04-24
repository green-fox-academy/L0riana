package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BankAccountController {

  private List<BankAccount> bankAccountList = new ArrayList<>();

  @RequestMapping(value = "/show", method = RequestMethod.GET)
  public String showBalance(Model model) {
    model.addAttribute("bankaccount", new BankAccount("Simba", 2000, "lion"));
    return "bankofsimba";
  }

  @RequestMapping(value = "/showaccounts", method = RequestMethod.GET)
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
