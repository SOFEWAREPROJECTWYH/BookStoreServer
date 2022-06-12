package com.wyh.bookstore.service;

import com.wyh.bookstore.entity.Sale;

import java.util.List;

public interface SaleService {
    List<Sale> getSaleInfo();
    Integer insertSale(Sale sale);
    Integer deleteSale(Sale sale);
    Integer updateSale(Sale sale);
}
