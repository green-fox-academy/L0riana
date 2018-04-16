package com.greenfoxacademy.frontend.models;

public class DoublingError {

  private String error;

  public DoublingError() {
    error = "Please provide an input!";
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
