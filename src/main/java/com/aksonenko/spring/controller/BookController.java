package com.aksonenko.spring.controller;

import com.aksonenko.spring.entity.Book;
import org.springframework.web.bind.annotation.*;
import com.aksonenko.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/books")
public class BookController {

  @Autowired
  private BookService bookService;

  @GetMapping("/getAll")
  public List<Book> getBooks() {
    List<Book> list = bookService.getAllBooks();
    return list;
  }

  @GetMapping("/{id}")
  public Book getBook(@PathVariable Integer id) {
    Book book = bookService.getBook(id);
    return book;
  }

  @PostMapping("/save")
  public Book saveBook(@RequestBody Book book) {
    bookService.saveBook(book);
    return book;
  }

  @DeleteMapping("/delete")
  public String deleteBook(@RequestParam("id") int id) {
    bookService.deleteBook(id);
    return "redirect:/";
  }

}
