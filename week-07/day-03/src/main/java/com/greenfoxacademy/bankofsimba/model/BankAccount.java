package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {

  private String name;
  private int balance;
  private String animalType;
  private String currency;

  private boolean isKing;

  public BankAccount() {
  }

  public BankAccount(String name, int balance, String animalType, boolean isKing) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
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

  public boolean isKing() {
    return isKing;
  }

  public void setKing(boolean king) {
    isKing = king;
  }

}
