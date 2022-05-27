package com.wyh.bookstore.dao;

import com.wyh.bookstore.entity.ShoppingTrolley;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ShoppingTrolleyDao {
    Integer initShoppingTrolley(Integer id,String username);
    ShoppingTrolley getShoppingTrolley(Integer id);
    Integer insertShoppingTrolley(ShoppingTrolley shoppingTrolley);
    Integer deleteShoppingTrolley(ShoppingTrolley shoppingTrolley);
}
