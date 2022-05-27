package com.wyh.bookstore.dao;

import com.wyh.bookstore.entity.Sale;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SaleDao {
    List<Sale> selectAllSale();
}
