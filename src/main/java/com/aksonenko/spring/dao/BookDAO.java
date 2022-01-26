package com.aksonenko.spring.dao;

import com.aksonenko.spring.entity.Book;

import java.util.List;

public interface BookDAO {

  List<Book> getAllBooks();

  void saveBook(Book book);

  Book getBook(int id);

  void deleteBook(int id);

}
