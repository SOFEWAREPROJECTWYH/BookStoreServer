package com.wyh.bookstore.service;

import com.wyh.bookstore.entity.Inventory;

import java.awt.print.Book;
import java.util.List;

public interface BookService {
    List<Inventory> getAllBookInfo();
    Integer insertBook(Inventory book);
    Integer deleteBook(Inventory book);
    Integer updateBook(Inventory book);
}
