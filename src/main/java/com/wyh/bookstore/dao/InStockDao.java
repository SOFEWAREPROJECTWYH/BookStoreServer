package com.wyh.bookstore.dao;

import com.wyh.bookstore.entity.InStock;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InStockDao {
    List<InStock> getInStock();
}