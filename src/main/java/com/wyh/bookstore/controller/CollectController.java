package com.wyh.bookstore.controller;

import com.wyh.bookstore.entity.Collect;
import com.wyh.bookstore.entity.CollectInsertEvent;
import com.wyh.bookstore.entity.Inventories;
import com.wyh.bookstore.entity.Inventory;
import com.wyh.bookstore.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@RestController
public class CollectController {
    @Autowired
    private CollectService collectService;
    @RequestMapping(value = "/collectInsert",method = RequestMethod.POST)
    public CollectInsertEvent insertCollectInfo(@RequestBody Collect collect) {
        Integer res=collectService.insertCollectInfo(collect);
        CollectInsertEvent collectInsertEvent=new CollectInsertEvent(res);
        return collectInsertEvent;
    }
    @RequestMapping(value = "/collectDelete",method = RequestMethod.POST)
    public Integer deleteCollectInfo(@RequestBody Collect collect) {
        Integer res=collectService.deleteCollectInfo(collect);
        return res;
    }
}
