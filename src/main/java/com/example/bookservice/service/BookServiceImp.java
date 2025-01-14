package com.example.bookservice.service;

import com.example.bookservice.models.Book;
import com.example.bookservice.repos.BookServiceRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service("BookServiceImp")
public class BookServiceImp implements BookService {
    private BookServiceRepository bookServiceRepository;
    public BookServiceImp(BookServiceRepository bookServiceRepository) {
        this.bookServiceRepository = bookServiceRepository;
    }
    @Override
    public List<Book> getAllBooks() {
        return bookServiceRepository.findAll();
    }

    public Book getBookById(Long id) {
        Optional<Book> optionalBook = bookServiceRepository.findById(id);
        if (optionalBook.isPresent()) {
            return optionalBook.get();
        }
        return null;
    }

    @Override
    public Book addBook(String title, String author, String genre) {
        Book book= bookServiceRepository.save(new Book(title,author,genre));
        return book;
    }

}
