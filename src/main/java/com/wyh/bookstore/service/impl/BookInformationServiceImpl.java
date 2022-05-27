package com.wyh.bookstore.service.impl;

import com.wyh.bookstore.dao.BookInformationDao;
import com.wyh.bookstore.entity.BookInformation;
import com.wyh.bookstore.service.BookInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookInformationServiceImpl implements BookInformationService {
    @Autowired
    private BookInformationDao bookInformationDao;
    @Override
    public List<BookInformation> getAllBookInformation() {
        return bookInformationDao.selectAllBookInfor();
    }
}
