package com.wyh.bookstore.service;

import com.wyh.bookstore.entity.Collect;

public interface CollectService {
    Integer insertCollectInfo(Collect collect);
    Integer deleteCollectInfo(Collect collect);
}
