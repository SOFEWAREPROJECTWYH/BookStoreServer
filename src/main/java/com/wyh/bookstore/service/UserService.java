package com.wyh.bookstore.service;

import com.wyh.bookstore.entity.User;

import java.util.List;

public interface UserService {
    List<User> getUserInfo();
    User getUserExistInfo(Integer id);
    Integer register(User user);
}
