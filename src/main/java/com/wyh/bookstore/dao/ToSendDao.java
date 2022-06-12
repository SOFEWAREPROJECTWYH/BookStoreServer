package com.wyh.bookstore.dao;

import com.wyh.bookstore.entity.ToSend;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ToSendDao {
    List<ToSend> getToSendInfo();
}
