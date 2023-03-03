package com.mkyong;

import javax.persistence.*;

/// https://mkyong.com/spring-boot/spring-boot-spring-data-jpa/
@Entity
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  public Long getId() { return id; }
  public void setId(Long value) { id = value; }

  private String name;
  public String getName() { return name; }
  public void setName(String value) { name = value; }

  public Book() { }
  public Book(String value) { name = value; }

  @Override
  public String toString() {
    return "Book{" + "id=" + id + ", name='" + name + '\'' + '}';
  }
}
