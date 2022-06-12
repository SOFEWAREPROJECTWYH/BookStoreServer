package com.wyh.bookstore.controller;

import com.wyh.bookstore.entity.ToSend;
import com.wyh.bookstore.entity.User;
import com.wyh.bookstore.service.ToSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ResponseBody
@RestController
public class ToSendController {
    @Autowired
    private ToSendService toSendService;
    @RequestMapping(value = "/tosend",method = RequestMethod.GET)
    public List<ToSend> getToSendInfo(){
        List<ToSend> toSendList =toSendService.getToSendInfo();
        return toSendList;
    }
}
