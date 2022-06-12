package com.wyh.bookstore.service.impl;

import com.wyh.bookstore.dao.WaitForReceivingDao;
import com.wyh.bookstore.entity.WaitForReceiving;
import com.wyh.bookstore.service.WaitForReceivingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaitForReceivingServiceImpl implements WaitForReceivingService {
    @Autowired
    private WaitForReceivingDao waitForReceivingDao;
    @Override
    public List<WaitForReceiving> getWaitForReceivingInfo() {
        return waitForReceivingDao.getWaitForReceivingInfo();
    }
}
