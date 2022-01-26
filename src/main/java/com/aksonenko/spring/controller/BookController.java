package com.aksonenko.spring.controller;

import com.aksonenko.spring.entity.Book;
import org.springframework.stereotype.Controller;
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

//  @PostMapping("/save")
//  public Book saveBook(@RequestBody Book book) {
//    System.out.println(book);
//    System.out.println(book.getName());
//    bookService.saveBook(book);
//
//    return book;
//  }
  @PostMapping("/save")
  public Book saveBook(@RequestBody Book book) {
    System.out.println(book.getName());
//    System.out.println(book.getName());
//    bookService.saveBook(book);

    return book;
  }

//  @PostMapping("/save")
//  public String saveBook(@RequestParam("book") Book book) {
//    bookService.saveBook(book);
//    return "redirect:/";
//  }

  @DeleteMapping("/delete")
  public String deleteBook(@RequestParam("id") int id) {
    bookService.deleteBook(id);
    return "redirect:/";
  }

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
