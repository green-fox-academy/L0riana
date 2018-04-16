package com.greenfoxacademy.frontend.models;

public class JsonModel {
  private int until;
  private int result;
  private String error;

  public JsonModel(int until) {
    this.until = until;
  }

  public JsonModel() {
    //this.error = "Please provide a number!";
  }

  public int sum() {
    result = 0;
    for (int i = 1; i <= until; i++) {
      result += i;
    }
    return result;
  }

  public int factor() {
    result = 1;
    for (int i = 1; i <= until; i++) {
      result *= i;
    }
    return result;
  }

  public int getUntil() {
    return until;
  }

  public void setUntil(int until) {
    this.until = until;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
