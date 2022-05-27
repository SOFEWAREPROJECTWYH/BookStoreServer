package com.wyh.bookstore.dao;

import com.wyh.bookstore.entity.BookInformation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookInformationDao {
    List<BookInformation> selectAllBookInfor();
}
