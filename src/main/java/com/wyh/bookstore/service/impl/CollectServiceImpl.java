package com.wyh.bookstore.service.impl;

import com.wyh.bookstore.dao.CollectDao;
import com.wyh.bookstore.entity.Collect;
import com.wyh.bookstore.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollectServiceImpl implements CollectService {
    @Autowired
    private CollectDao collectDao;
    @Override
    public Integer insertCollectInfo(Collect collect) {
        return collectDao.insertCollectInfo(collect);
    }

    @Override
    public Integer deleteCollectInfo(Collect collect) {
        return collectDao.deleteCollectInfo(collect);
    }
}
