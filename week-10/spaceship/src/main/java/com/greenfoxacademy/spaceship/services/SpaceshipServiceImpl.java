package com.greenfoxacademy.spaceship.services;

import com.greenfoxacademy.spaceship.models.Planet;
import com.greenfoxacademy.spaceship.models.Spaceship;
import com.greenfoxacademy.spaceship.repositories.PlanetRepository;
import com.greenfoxacademy.spaceship.repositories.SpaceshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpaceshipServiceImpl implements SpaceshipService{

  private PlanetRepository planetRepository;
  private SpaceshipRepository spaceshipRepository;
  private Spaceship spaceship;

  public SpaceshipServiceImpl() {
  }

  @Autowired
  public SpaceshipServiceImpl(PlanetRepository planetRepository, SpaceshipRepository spaceshipRepository) {
    this.planetRepository = planetRepository;
    this.spaceshipRepository = spaceshipRepository;
    this.spaceship = spaceshipRepository.findOneById(1L);
  }

  @Override
  public List<Planet> getAllPlanet() {
    return planetRepository.findAll();
  }

  @Override
  public Spaceship getSpaceship() {
    return spaceship;
  }
}
