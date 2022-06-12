package com.wyh.bookstore.service.impl;

import com.wyh.bookstore.dao.ToSendDao;
import com.wyh.bookstore.entity.ToSend;
import com.wyh.bookstore.service.ToSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToSendServiceImpl implements ToSendService {
    @Autowired
    private ToSendDao toSendDao;

    @Override
    public List<ToSend> getToSendInfo() {
        return toSendDao.getToSendInfo();
    }
}
