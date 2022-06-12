package com.wyh.bookstore.dao;

import com.wyh.bookstore.entity.InStock;
import org.apache.ibatis.annotations.Mapper;

import javax.management.openmbean.InvalidOpenTypeException;
import java.util.List;

@Mapper
public interface InStockDao {
    List<InStock> getInStock();
    Integer insertInstock(InStock inStock);
    Integer deleteInstock(InStock inStock);
    Integer updateInstock(InStock inStock);
}
