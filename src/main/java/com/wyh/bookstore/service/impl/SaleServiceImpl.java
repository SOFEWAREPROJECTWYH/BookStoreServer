package com.wyh.bookstore.service.impl;

import com.wyh.bookstore.dao.SaleDao;
import com.wyh.bookstore.entity.Sale;
import com.wyh.bookstore.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {

    @Autowired
    private SaleDao saleDao;
    @Override
    public List<Sale> getSaleInfo() {
        return saleDao.selectAllSale();
    }
}
