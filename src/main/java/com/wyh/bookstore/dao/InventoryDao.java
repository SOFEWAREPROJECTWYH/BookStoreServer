package com.wyh.bookstore.dao;

import com.wyh.bookstore.entity.Inventory;
import org.apache.ibatis.annotations.Mapper;

import java.awt.print.Book;
import java.util.List;
@Mapper
public interface InventoryDao {
    List<Inventory> selectAllBookInventory();
    Integer insertBook(Inventory book);
    Integer deleteBook(Inventory inventory);
    Integer updateBook(Inventory inventory);
}
