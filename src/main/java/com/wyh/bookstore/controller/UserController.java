package com.wyh.bookstore.controller;

import com.wyh.bookstore.entity.User;
import com.wyh.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public User login(@RequestBody User user){
        User userinfo=userService.getUserExistInfo(user.getId());
        return userinfo;
    }
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public Integer register(@RequestBody User user){
        Integer amount=userService.register(user);
        return amount;
    }
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public List<User> getUserInfo(){
        List<User> users = userService.getUserInfo();
        return users;
    }
    @RequestMapping(value = "/deleteUser",method = RequestMethod.GET)
    public Integer deleteUser(User user){
        Integer deleteCondition = userService.deleteUser(user);
        return deleteCondition;
    }
    @RequestMapping(value = "/updateUser",method = RequestMethod.GET)
    public Integer updateUser(User user){
        Integer updateCondition = userService.updateUser(user);
        return updateCondition;
    }
}
