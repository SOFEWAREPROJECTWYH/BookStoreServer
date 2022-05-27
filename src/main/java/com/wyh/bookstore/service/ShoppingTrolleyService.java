package com.wyh.bookstore.service;

import com.wyh.bookstore.entity.ShoppingTrolley;

public interface ShoppingTrolleyService {
    Integer initShoppingTrolley(Integer id,String username);
    ShoppingTrolley getShoppingTrolley(Integer id);
    Integer insertShoppingTrolley(ShoppingTrolley shoppingTrolley);
    Integer deleteShoppingTrolley(ShoppingTrolley shoppingTrolley);
}
