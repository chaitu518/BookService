package com.example.bookservice.models;

import jakarta.persistence.Entity;


@Entity(name = "books")
public class Book extends BaseModel {
    private String title;
    private String author;
    private String genre;
    public Book() {
        super();
    }
    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getGenre() {
        return this.genre;
    }
}
