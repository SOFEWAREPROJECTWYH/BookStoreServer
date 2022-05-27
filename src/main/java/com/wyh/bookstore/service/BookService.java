package com.wyh.bookstore.service;

import com.wyh.bookstore.entity.Inventory;

import java.util.List;

public interface BookService {
    List<Inventory> getAllBookInfo();
}
