package com.wyh.bookstore.service.impl;

import com.wyh.bookstore.dao.InventoryDao;
import com.wyh.bookstore.entity.Inventory;
import com.wyh.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private InventoryDao inventoryDao;

    @Override
    public List<Inventory> getAllBookInfo() {
        return inventoryDao.selectAllBookInventory();
    }

    @Override
    public Integer insertBook(Inventory book) {
        return inventoryDao.insertBook(book);
    }

    @Override
    public Integer deleteBook(Inventory book) {
        return inventoryDao.deleteBook(book);
    }

    @Override
    public Integer updateBook(Inventory book) {
        return inventoryDao.updateBook(book);
    }


}
