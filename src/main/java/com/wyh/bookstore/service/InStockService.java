package com.wyh.bookstore.service;

import com.wyh.bookstore.entity.InStock;

import java.util.List;

public interface InStockService {
    List<InStock> getInStockInfo();
    Integer insertInStock(InStock inStock);
    Integer deleteInStock(InStock inStock);
    Integer updateInStock(InStock inStock);
}
