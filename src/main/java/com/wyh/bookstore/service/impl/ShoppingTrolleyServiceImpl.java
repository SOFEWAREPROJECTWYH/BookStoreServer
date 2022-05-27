package com.wyh.bookstore.service.impl;

import com.wyh.bookstore.dao.ShoppingTrolleyDao;
import com.wyh.bookstore.entity.ShoppingTrolley;
import com.wyh.bookstore.service.ShoppingTrolleyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShoppingTrolleyServiceImpl implements ShoppingTrolleyService {
    @Autowired
    private ShoppingTrolleyDao shoppingTrolleyDao;

    @Override
    public Integer initShoppingTrolley(Integer id,String username) {
        return shoppingTrolleyDao.initShoppingTrolley(id,username);
    }

    @Override
    public ShoppingTrolley getShoppingTrolley(Integer id) {
        return shoppingTrolleyDao.getShoppingTrolley(id);
    }

    @Override
    public Integer insertShoppingTrolley(ShoppingTrolley shoppingTrolley) {
        return shoppingTrolleyDao.insertShoppingTrolley(shoppingTrolley);
    }

    @Override
    public Integer deleteShoppingTrolley(ShoppingTrolley shoppingTrolley) {
        return shoppingTrolleyDao.deleteShoppingTrolley(shoppingTrolley);
    }
}
