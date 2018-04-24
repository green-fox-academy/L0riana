package com.greenfoxacademy.licenceplate.models;

import java.util.List;

public class LicencePlateResponse {

  private String result;
  private List<LicencePlate> input;

  public LicencePlateResponse(List<LicencePlate> licencePlatesByCarBrand) {
    this.input = licencePlatesByCarBrand;
    this.result = "ok";
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public List<LicencePlate> getInput() {
    return input;
  }

  public void setInput(List<LicencePlate> input) {
    this.input = input;
  }
}
