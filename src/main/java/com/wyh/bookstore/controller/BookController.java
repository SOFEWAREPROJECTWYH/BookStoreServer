package com.wyh.bookstore.controller;

import com.wyh.bookstore.entity.Inventories;
import com.wyh.bookstore.entity.Inventory;
import com.wyh.bookstore.entity.User;
import com.wyh.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@CrossOrigin
@ResponseBody
@RestController
@RequestMapping("/bookinfo")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/book",method = RequestMethod.GET)
    public Inventories getBookInfo() {
        List<Inventory> inventoryList = bookService.getAllBookInfo();
        Inventories inventories=new Inventories();
        inventories.setInventoryList(inventoryList);
        return inventories;
    }
    @RequestMapping(value = "/bookimage",method = RequestMethod.GET)
    public Inventories getBookImage() throws Exception {
        System.out.println(new BookInformationController().downloadBookImage());
        List<Inventory> inventoryList = bookService.getAllBookInfo();
        Inventories inventories=new Inventories();
        inventories.setInventoryList(inventoryList);
        return inventories;
    }

}
