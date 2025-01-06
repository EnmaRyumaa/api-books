package com.nan.tech.api_books.controllers;

import com.nan.tech.api_books.dto.BookDTO;
import com.nan.tech.api_books.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "/{id}")
    public BookDTO findById (@PathVariable Long id) {
        BookDTO bookDto = bookService.findById(id);

        return bookDto;
    }
}
