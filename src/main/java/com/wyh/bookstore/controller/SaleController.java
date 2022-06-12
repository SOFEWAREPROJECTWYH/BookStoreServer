package com.wyh.bookstore.controller;

import com.wyh.bookstore.entity.Inventory;
import com.wyh.bookstore.entity.Sale;
import com.wyh.bookstore.service.BookService;
import com.wyh.bookstore.service.SaleService;
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
@RequestMapping("/SaleInfo")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @RequestMapping(value = "/sale",method = RequestMethod.GET)
    public List<Sale> getBookInfo() {
        List<Sale> saleList = saleService.getSaleInfo();
        return saleList;
    }
    @RequestMapping(value = "/insertSale",method = RequestMethod.GET)
    public Integer insertSaleInfo(Sale sale) {
        Integer insertCondition = saleService.insertSale(sale);
        return insertCondition;
    }
    @RequestMapping(value = "/deleteSale",method = RequestMethod.GET)
    public Integer deleteSaleInfo(Sale sale) {
        Integer insertCondition = saleService.deleteSale(sale);
        return insertCondition;
    }
    @RequestMapping(value = "/updateSale",method = RequestMethod.GET)
    public Integer updateSaleInfo(Sale sale) {
        Integer updateCondition = saleService.updateSale(sale);
        return updateCondition;
    }
}
