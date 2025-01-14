package com.example.bookservice.controller;

import com.example.bookservice.dto.BookResquestDto;
import com.example.bookservice.models.Book;
import com.example.bookservice.service.BookService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/books")
public class BookServiceController {
    private BookService bookService;
    public BookServiceController(@Qualifier("BookServiceImp") BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping("")
    public List<Book> getBooks() {
        return bookService.getAllBooks();
    }
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable(name = "id") Long id) {
        return bookService.getBookById(id);
    }
    @PostMapping("")
    public Book addBook(@RequestBody BookResquestDto bookrqDto) {

        return bookService.addBook(bookrqDto.getTitle(),bookrqDto.getAuthor(),bookrqDto.getGenre());
    }

}
