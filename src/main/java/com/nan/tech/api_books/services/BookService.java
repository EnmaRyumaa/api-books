package com.nan.tech.api_books.services;

import com.nan.tech.api_books.dto.BookDTO;
import com.nan.tech.api_books.entities.Book;
import com.nan.tech.api_books.repositories.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public BookDTO findById (Long id) {
        Book book = bookRepository.findById(id).get();
        return new BookDTO(book);
    }
}
