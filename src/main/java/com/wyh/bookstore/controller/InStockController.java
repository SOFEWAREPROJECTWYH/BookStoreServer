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
    public List<InStock> getBookInfo() {
        List<InStock> inStocks = inStockService.getInStockInfo();
        return inStocks;
    }
    @RequestMapping(value = "/insertInstock",method = RequestMethod.GET)
    public Integer insertInstock(InStock inStock) {
        Integer insertCondition = inStockService.insertInStock(inStock);
        return insertCondition;
    }
    @RequestMapping(value = "/deleteInstock",method = RequestMethod.GET)
    public Integer deleteInstock(InStock inStock) {
        Integer deleteCondition = inStockService.deleteInStock(inStock);
        return deleteCondition;
    }
    @RequestMapping(value = "/updateInstock",method = RequestMethod.GET)
    public Integer updateInstock(InStock inStock) {
        Integer updateCondition = inStockService.updateInStock(inStock);
        return updateCondition;
    }
}
