package com.example.bookservice.repos;

import com.example.bookservice.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookServiceRepository extends JpaRepository<Book, Long> {
}
