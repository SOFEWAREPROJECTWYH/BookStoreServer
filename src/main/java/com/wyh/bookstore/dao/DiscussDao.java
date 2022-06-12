package com.wyh.bookstore.dao;

import com.wyh.bookstore.entity.Discuss;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DiscussDao {
    List<Discuss> getDiscussInfo();
}
