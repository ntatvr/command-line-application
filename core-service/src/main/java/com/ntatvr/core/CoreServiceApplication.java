package com.ntatvr.core;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ntatvr.core.scanner.MainHandler;

@SuppressWarnings("PMD")
@Slf4j
@SpringBootApplication
public class CoreServiceApplication implements CommandLineRunner {

  public static void main(final String[] args) {
    SpringApplication.run(CoreServiceApplication.class, args);
  }

  @Autowired
  private MainHandler mainHandler;

  @Override
  public void run(final String... args) {
    mainHandler.executeSearch();
  }
}
