package ru.barinov.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.barinov.library.entity.Book;
import ru.barinov.library.repository.BookRepository;

@Controller
public class BookController {
    private BookRepository repository;

    @Autowired
    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    @GetMapping(path = "/books")
    public @ResponseBody Iterable<Book> getBooks() {
        return repository.findAll();
    }

    @PostMapping(path = "book")
    public @ResponseBody String addBook(Book book) {
        repository.save(book);
        return "OK";
    }
}