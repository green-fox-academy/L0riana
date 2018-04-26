package com.greenfoxacademy.licenceplate.services;

import com.greenfoxacademy.licenceplate.models.LicencePlate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LicencePlateService {

  List<LicencePlate> getAll();

  List<LicencePlate> getByBrand(String carBrand);

}
