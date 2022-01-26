package com.aksonenko.spring.service;

import com.aksonenko.spring.dao.BookDAO;
import com.aksonenko.spring.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

  @Autowired
  private BookDAO bookDAO;

  @Override
  @Transactional
  public List<Book> getAllBooks() {
    return bookDAO.getAllBooks();
  }

  @Override
  @Transactional
  public void saveBook(Book book) {
    bookDAO.saveBook(book);

  }

  @Override
  @Transactional
  public Book getBook(int id) {
    return bookDAO.getBook(id);
  }

  @Override
  @Transactional
  public void deleteBook(int id) {
    bookDAO.deleteBook(id);

  }

}
