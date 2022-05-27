package com.wyh.bookstore.controller;

import com.wyh.bookstore.entity.InStock;
import com.wyh.bookstore.entity.Inventory;
import com.wyh.bookstore.service.BookService;
import com.wyh.bookstore.service.InStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ResponseBody
@RestController
@RequestMapping("/InStockInfo")
public class InStockController {
    @Autowired
    private InStockService inStockService;

    @RequestMapping(value = "/instock",method = RequestMethod.GET)
    public Map<String, Object> getBookInfo() {
        List<InStock> inStocks = inStockService.getInStockInfo();
        HashMap<String, Object> response= new HashMap<>();
        response.put("code","200");
        response.put("msg","success");
        response.put("data",inStocks);
        return response;
    }
}
