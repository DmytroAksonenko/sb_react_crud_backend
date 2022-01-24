package com.aksonenko.spring.controller;

import com.aksonenko.spring.entity.Book;
import org.springframework.web.bind.annotation.*;
//import com.aksonenko.spring.service.BookService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/books")
public class BookController {
//
//  @Autowired
//  private BookService bookService;


  @GetMapping("/getAll")
  public List<Book> getBooks() {

//    Test
    Book book1 = new Book(1, "book1", "author3", "genre2", 500);
    Book book3 = new Book(3, "book3", "author2", "genre1", 700);
//    book1
    List<Book> list = new ArrayList<>();
    list.add(book1);
    list.add(book3);

    return list;
  }

  @GetMapping("/{id}")
  // public Book getBook(@RequestParam("book") Integer id) {
  public Book getBook(@PathVariable Integer id){
//    Test
    List<Book> books = new ArrayList<>(2);
    books.add(new Book(2, "book2", "author2", "genre2", 500));
    books.add(new Book(3, "book3", "author3", "genre3", 400));

    return books.stream()
      .filter(book -> book.getId() == id)
      .findFirst()
      .orElse(null);
  }

//  @RequestMapping("/")
//  public String showAllBooks(Model model) {
//
//    List<Book> allBooks = bookService.getAllBooks();
//    model.addAttribute("allBooks", allBooks);
//
//    return "all-books";
//  }
//
//  @RequestMapping("/addNewBook")
//  public String addNewBook(Model model) {
//
//    Book book = new Book();
//    model.addAttribute("book", book);
//
//    return "book-info";
//
//  }
//
//  @RequestMapping("/saveBook")
//  public String saveBook(@ModelAttribute("book") Book book) {
//
//    bookService.saveBook(book);
//
//    return "redirect:/";
//
//  }
//
//  @RequestMapping("/updateInfo")
//  public String updateBook(@RequestParam("bookId") int id, Model model) {
//
//    Book book = bookService.getBook(id);
//    model.addAttribute("book", book);
//
//    return "book-info";
//
//  }
//
//  @RequestMapping("/deleteBook")
//  public String deleteBook(@RequestParam("bookId") int id) {
//
//    bookService.deleteBook(id);
//
//    return "redirect:/";
//  }

}
