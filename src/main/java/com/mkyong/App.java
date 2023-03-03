package com.mkyong;

import java.time.*;

import org.slf4j.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;


@SpringBootApplication
public class App implements CommandLineRunner {

  @Autowired
  private BookRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }

  @Override
  public void run(String[] args) {

    repository.save(new Book("Java"));
    repository.save(new Book("Micronaut"));

    System.err.println("\n\nfindAll()");
    repository.findAll().forEach(x -> System.err.println(x));

    System.err.println("\n\nfindById(1L)");
    repository.findById(1l).ifPresent(x -> System.err.println(x));

    System.err.println("\n\nfindByName('Micronaut')");
    repository.findByName("Micronaut").forEach(x -> System.err.println(x));

    System.err.println("\n\n   pause " + LocalDateTime.now());
    try { Thread.currentThread().sleep(20_000); } catch (InterruptedException e){ }
    System.err.println("conclued " + LocalDateTime.now() + "\n\n");
  }
}
