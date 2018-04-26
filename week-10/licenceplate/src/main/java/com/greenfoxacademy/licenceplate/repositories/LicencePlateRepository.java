package com.greenfoxacademy.licenceplate.repositories;

import com.greenfoxacademy.licenceplate.models.LicencePlate;
import com.greenfoxacademy.licenceplate.services.LicencePlateService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LicencePlateRepository extends CrudRepository<LicencePlate, String> {

  List<LicencePlate> findAll();

  List<LicencePlate> findAllByCarBrand(String carBrand);

}
