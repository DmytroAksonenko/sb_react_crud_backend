package com.aksonenko.spring.service;

import com.aksonenko.spring.entity.Book;

import java.util.List;

public interface BookService {

  List<Book> getAllBooks();

  void saveBook(Book book);

  Book getBook(int id);

  void deleteBook(int id);

}
