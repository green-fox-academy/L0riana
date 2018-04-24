package com.greenfoxacademy.licenceplate.services;

import com.greenfoxacademy.licenceplate.models.LicencePlate;
import com.greenfoxacademy.licenceplate.repositories.LicencePlateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicencePlateServiceImpl implements LicencePlateService {

  private LicencePlateRepository licencePlateRepository;

  @Autowired
  public LicencePlateServiceImpl(LicencePlateRepository licencePlateRepository) {
    this.licencePlateRepository = licencePlateRepository;
  }

  @Override
  public List<LicencePlate> getAllLicencePlate() {
    return licencePlateRepository.findAll();
  }

  @Override
  public List<LicencePlate> getLicencePlatesByCarBrand(String carBrand) {
    return licencePlateRepository.findAllByCarBrand(carBrand);
  }

  @Override
  public List<LicencePlate> getAllPoliceCar() {
    return licencePlateRepository.findAllByPlateStartingWith("rb");
  }

  @Override
  public List<LicencePlate> getAllDiplomatCar() {
    return licencePlateRepository.findAllByPlateStartingWith("dt");
  }

  @Override
  public List<LicencePlate> getAllByLicencePlate(String plate) {
    return licencePlateRepository.findAllByPlateContaining(plate);
  }

  public boolean validateSearch(String search) {
    return search.matches("^[-a-zA-Z0-9._]+");
  }

  public List<LicencePlate> searchedPlate(String plate) {
    if (plate == null) {
      return null;
    } else if (plate.equals("police")) {
      return getAllPoliceCar();
    } else if (plate.equals("diplomat")) {
      return getAllDiplomatCar();
    } else {
      return getAllByLicencePlate(plate);
    }

  }
}
