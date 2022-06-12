package com.wyh.bookstore.service.impl;

import com.wyh.bookstore.dao.UserDao;
import com.wyh.bookstore.entity.User;
import com.wyh.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserInfo() {
        return userDao.selectUserInfo();
    }

    @Override
    public User getUserExistInfo(Integer id) {
        return userDao.selectUserExist(id);
    }

    @Override
    public Integer register(User user) {
        return userDao.register(user);
    }

    @Override
    public Integer deleteUser(User user) {
        return userDao.deleteUser(user);
    }

    @Override
    public Integer updateUser(User user) {
        return userDao.updateUser(user);
    }

}
