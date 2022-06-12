package com.wyh.bookstore.dao;

import com.wyh.bookstore.entity.Collect;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CollectDao {
    Integer insertCollectInfo(Collect collect);
    Integer deleteCollectInfo(Collect collect);
}
