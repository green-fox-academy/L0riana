package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {

  private String name;
  private int balance;
  private String animalType;
  private String currency;

  public BankAccount(String name, int balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    currency = "Zebra";
  }

  public String getName() {
    return name;
  }

  public int getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public String getCurrency() {
    return currency;
  }
}
