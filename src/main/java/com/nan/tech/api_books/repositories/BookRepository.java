package com.nan.tech.api_books.repositories;

import com.nan.tech.api_books.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
