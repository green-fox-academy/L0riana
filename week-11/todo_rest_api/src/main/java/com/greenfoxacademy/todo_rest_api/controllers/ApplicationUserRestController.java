package com.greenfoxacademy.todo_rest_api.controllers;

import com.greenfoxacademy.todo_rest_api.models.ApplicationUser;
import com.greenfoxacademy.todo_rest_api.models.JsonResponse;
import com.greenfoxacademy.todo_rest_api.services.ApplicationUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationUserRestController {

  private ApplicationUserService applicationUserService;
  private PasswordEncoder passwordEncoder;

  @Autowired
  public ApplicationUserRestController(ApplicationUserService applicationUserService, PasswordEncoder passwordEncoder) {
    this.applicationUserService = applicationUserService;
    this.passwordEncoder = passwordEncoder;
  }

  @PostMapping(value = {"/sign_up"})
  public ResponseEntity register(@RequestBody(required = true) ApplicationUser newApplicationUser) {
    if (newApplicationUser != null) {
      newApplicationUser.setPassword(passwordEncoder.encode(newApplicationUser.getPassword()));
      applicationUserService.save(newApplicationUser);
      return new ResponseEntity(new JsonResponse("User is registered"), HttpStatus.OK);
    }
    else {
      return new ResponseEntity(new JsonResponse("Error"), HttpStatus.UNAUTHORIZED);
    }
  }

  @PostMapping(value = {"/login"})
  public ResponseEntity login(@RequestBody(required = true) ApplicationUser applicationUser) {
    if (applicationUser != null) {
      return new ResponseEntity(new JsonResponse("Successfully logged in"), HttpStatus.OK);
    }
    else {
      return new ResponseEntity(new JsonResponse("Error"), HttpStatus.UNAUTHORIZED);
    }
  }
}
