package com.wyh.bookstore.controller;

import com.wyh.bookstore.entity.ShoppingTrolley;
import com.wyh.bookstore.entity.User;
import com.wyh.bookstore.service.ShoppingTrolleyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@RestController
public class ShoppingTrolleyController {
    @Autowired
    private ShoppingTrolleyService shoppingTrolleyService;
    @RequestMapping(value = "/initShoppingTrolley",method = RequestMethod.POST)
    public Integer initShopTro(@RequestBody User user){
        Integer change = shoppingTrolleyService.initShoppingTrolley(user.getId(),user.getName());
        return change;
    }
    @RequestMapping(value = "/ShoppingTrolley",method = RequestMethod.POST)
    public ShoppingTrolley getUserInfo(@RequestBody User user){
        ShoppingTrolley shoppingTrolley=shoppingTrolleyService.getShoppingTrolley(user.getId());
        return shoppingTrolley;
    }
    @RequestMapping(value = "/insertShopTro",method = RequestMethod.POST)
    public Integer getUserInfo(@RequestBody ShoppingTrolley shoppingTrolley){
        ShoppingTrolley shoppingTrolleyAlready=shoppingTrolleyService.getShoppingTrolley(shoppingTrolley.getId());
        if (shoppingTrolleyAlready.getShoptrobookid()==null){
            Integer del=shoppingTrolleyService.deleteShoppingTrolley(shoppingTrolley);
            shoppingTrolleyService.insertShoppingTrolley(shoppingTrolley);
        }else{
            shoppingTrolleyAlready.setShoptrobookid(shoppingTrolleyAlready.getShoptrobookid()+";"+shoppingTrolley.getShoptrobookid());
            shoppingTrolleyAlready.setShoptrobookname(shoppingTrolleyAlready.getShoptrobookname()+";"+shoppingTrolley.getShoptrobookname());
            shoppingTrolleyAlready.setShoptrobookurl(shoppingTrolleyAlready.getShoptrobookurl()+";"+shoppingTrolley.getShoptrobookurl());
            shoppingTrolleyAlready.setShoptrobookprice(shoppingTrolleyAlready.getShoptrobookprice()+";"+shoppingTrolley.getShoptrobookprice());
            Integer del=shoppingTrolleyService.deleteShoppingTrolley(shoppingTrolley);
            Integer in=shoppingTrolleyService.insertShoppingTrolley(shoppingTrolleyAlready);
            return in;
        }
        return 0;
    }
}
