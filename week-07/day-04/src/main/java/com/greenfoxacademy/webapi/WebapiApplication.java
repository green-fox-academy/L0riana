package com.greenfoxacademy.webapi;

import com.greenfoxacademy.webapi.hellobeanworld.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class WebapiApplication implements CommandLineRunner {

  @Autowired
  Printer printer;

  public static void main(String[] args) {
    SpringApplication.run(WebapiApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println(printer.log("hello"));
  }
}
