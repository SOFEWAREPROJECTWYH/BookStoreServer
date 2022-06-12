package com.wyh.bookstore.dao;

import com.wyh.bookstore.entity.WaitForReceiving;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface WaitForReceivingDao {
    List<WaitForReceiving> getWaitForReceivingInfo();
}
