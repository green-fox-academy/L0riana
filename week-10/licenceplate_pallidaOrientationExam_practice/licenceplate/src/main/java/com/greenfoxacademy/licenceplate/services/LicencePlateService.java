package com.greenfoxacademy.licenceplate.services;

import com.greenfoxacademy.licenceplate.models.LicencePlate;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Size;
import java.util.List;

@Service
public interface LicencePlateService {

  List<LicencePlate> getAllLicencePlate();

  List<LicencePlate> getLicencePlatesByCarBrand(String carBrand);

  List<LicencePlate> getAllPoliceCar();

  List<LicencePlate> getAllDiplomatCar();

  List<LicencePlate> getAllByLicencePlate(String plate);

  boolean validateSearch(String plate);

  List<LicencePlate> searchedPlate(String plate);
}
