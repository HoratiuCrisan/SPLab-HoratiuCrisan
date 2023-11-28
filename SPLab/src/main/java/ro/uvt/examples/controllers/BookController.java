package ro.uvt.examples.controllers;

import org.springframework.web.bind.annotation.*;
import ro.uvt.info.splab.Book;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")

public class BookController {
    List<String> books = new ArrayList<>();


    @GetMapping
    public List<String> getBooks() {
        this.books.add("Book 1");
        this.books.add("Book 2");
        return this.books;
    }

    @GetMapping("/{id}")
    public String getBook (@PathVariable Long id) {
        for (int i = 0; i < books.size(); i++) {
            if (i == id)
                return books.get(i);
        }
        return "Book with id " + id + "does not exist!";
    }

}
