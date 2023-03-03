package com.mkyong;

import java.util.List;

import org.springframework.data.repository.*;


public interface BookRepository extends CrudRepository<Book, Long> {

  List<Book> findByName(String name);
}
