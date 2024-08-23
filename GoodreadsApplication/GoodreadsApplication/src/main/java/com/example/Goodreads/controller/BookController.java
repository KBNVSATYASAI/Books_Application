package com.example.Goodreads.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.context.annotation.Bean;

import com.example.Goodreads.model.Book;
import com.example.Goodreads.service.BookJpaService;
@RestController
public class BookController {

    @Autowired
    private BookJpaService bs;

    @GetMapping("/")
    public String welcome() {
        return "Hello, see the books by adding /books to the existing path";
    }

    @GetMapping("/books")
    public ArrayList<Book> getBooks() {
        return bs.getBooks();
    }

    @GetMapping("/books/{bookId}")
    public Book getBookById(@PathVariable("bookId") int bookId) {
        return bs.getBookById(bookId);
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        return bs.addBook(book);
    }

    @PutMapping("/books/{bookId}")
    public Book updateBook(@PathVariable("bookId") int bookId, @RequestBody Book book) {
        return bs.updateBook(bookId, book);
    }

    @DeleteMapping("/books/{bookId}")
    public void deleteBook(@PathVariable("bookId") int bookId) {
        bs.DeleteBook(bookId);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")  // Allow requests from any origin
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
            }
        };
    }
}
