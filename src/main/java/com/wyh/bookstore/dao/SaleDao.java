package com.wyh.bookstore.dao;

import com.wyh.bookstore.entity.Sale;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SaleDao {
    List<Sale> selectAllSale();
    Integer insertSale(Sale sale);
    Integer deleteSale(Sale sale);
    Integer updateSale(Sale sale);
}
