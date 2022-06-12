package com.wyh.bookstore.controller;

import com.wyh.bookstore.entity.Collect;
import com.wyh.bookstore.entity.CollectInsertEvent;
import com.wyh.bookstore.entity.Discuss;
import com.wyh.bookstore.service.CollectService;
import com.wyh.bookstore.service.DiscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ResponseBody
@RestController
public class DiscussController {
    @Autowired
    private DiscussService discussService;
    @RequestMapping(value = "/discussInfo",method = RequestMethod.GET)
    public List<Discuss> getDiscussInfo() {
        List<Discuss> discusses=discussService.getDiscussInfo();
        return discusses;
    }
}
