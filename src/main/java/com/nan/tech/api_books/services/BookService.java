package com.nan.tech.api_books.services;

import com.nan.tech.api_books.dto.BookDTO;
import com.nan.tech.api_books.entities.Book;
import com.nan.tech.api_books.repositories.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public BookDTO findById (Long id) {
        Book book = bookRepository.findById(id).get();
        return new BookDTO(book);
    }

    public Page<BookDTO> findAll (Pageable pageable) {
        Page<Book> books = bookRepository.findAll(pageable);

        return books.map(x -> new BookDTO(x));
    }

    public BookDTO insert (BookDTO bookDTO) {
        Book book = new Book();
        copyEntitieForDto(book, bookDTO);
        book = bookRepository.save(book);

        return new BookDTO(book);
    }

    public BookDTO update (Long id, BookDTO bookDTO) {
        Book book = bookRepository.findById(id).get();
        copyEntitieForDto(book, bookDTO);
        book = bookRepository.save(book);

        return new BookDTO(book);
    }

    private void copyEntitieForDto(Book book, BookDTO bookDTO) {
        book.setName(bookDTO.getName());
        book.setAuthor(bookDTO.getAuthor());
        book.setDescription(bookDTO.getDescription());
    }
}
