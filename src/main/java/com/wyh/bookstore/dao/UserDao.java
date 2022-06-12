package com.wyh.bookstore.dao;

import com.wyh.bookstore.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    List<User> selectUserInfo();
    User selectUserExist(Integer id);
    Integer register(User user);
    Integer deleteUser(User user);
    Integer updateUser(User user);
}
