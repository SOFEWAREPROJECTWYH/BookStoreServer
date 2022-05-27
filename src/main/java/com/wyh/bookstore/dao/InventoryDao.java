package com.wyh.bookstore.dao;

import com.wyh.bookstore.entity.Inventory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface InventoryDao {
    List<Inventory> selectAllBookInventory();
}
