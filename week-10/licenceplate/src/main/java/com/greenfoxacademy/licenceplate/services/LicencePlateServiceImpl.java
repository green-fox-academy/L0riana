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
}
