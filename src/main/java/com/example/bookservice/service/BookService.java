package com.example.bookservice.service;


import com.example.bookservice.models.Book;

import java.util.List;

public interface BookService {
    public List<Book> getAllBooks();
    public Book getBookById(Long id);
    public Book addBook(String title, String author, String genre);
}
