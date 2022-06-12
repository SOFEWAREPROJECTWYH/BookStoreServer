package com.wyh.bookstore.service.impl;

import com.wyh.bookstore.dao.DiscussDao;
import com.wyh.bookstore.entity.Discuss;
import com.wyh.bookstore.service.DiscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DiscussServiceImpl implements DiscussService {

    @Autowired
    private DiscussDao discussDao;
    @Override
    public List<Discuss> getDiscussInfo() {
        return discussDao.getDiscussInfo();
    }
}
