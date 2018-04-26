package com.greenfoxacademy.licenceplate.services;

import com.greenfoxacademy.licenceplate.models.LicencePlate;
import com.greenfoxacademy.licenceplate.repositories.LicencePlateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicencePlateServiceImpl implements LicencePlateService {

  private final LicencePlateRepository licencePlateRepository;

  @Autowired
  public LicencePlateServiceImpl(LicencePlateRepository licencePlateRepository) {
    this.licencePlateRepository = licencePlateRepository;
  }

  @Override
  public List<LicencePlate> getAll() {
    return licencePlateRepository.findAll();
  }

  @Override
  public List<LicencePlate> getByBrand(String carBrand) {
    return licencePlateRepository.findAllByCarBrand(carBrand);
  }

  @Override
  public List<LicencePlate> getAllPolice() {
    return licencePlateRepository.findAllByPlateStartingWith("RB");
  }

  @Override
  public List<LicencePlate> getAllDiplomat() {
    return licencePlateRepository.findAllByPlateStartingWith("DT");
  }

  @Override
  public List<LicencePlate> getAllByPlate(String plate) {
    return licencePlateRepository.findAllByPlateContaining(plate);
  }

  @Override
  public boolean validateSearch(String plate) {
    return plate.matches("^[a-zA-Z0-9-]+");
  }

  public List<LicencePlate> searchedPlate(String plate) {
    if (plate == null) {
      return null;
    } else if (plate.equals("police")) {
      return getAllPolice();
    } else if (plate.equals("diplomat")) {
      return getAllDiplomat();
    } else {
      return getAllByPlate(plate);
    }
  }
}