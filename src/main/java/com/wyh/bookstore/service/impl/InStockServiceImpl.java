package com.wyh.bookstore.service.impl;

import com.wyh.bookstore.dao.InStockDao;
import com.wyh.bookstore.entity.InStock;
import com.wyh.bookstore.service.InStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InStockServiceImpl implements InStockService {

    @Autowired
    private InStockDao inStockDao;

    @Override
    public List<InStock> getInStockInfo() {
        return inStockDao.getInStock();
    }
}
