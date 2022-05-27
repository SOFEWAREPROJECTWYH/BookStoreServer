package com.wyh.bookstore.entity;

import lombok.Data;

@Data
public class Inventory {
    private Integer bookid;
    private String bookname;
    private Integer price;
    private Integer quantity;
    private String type;
    private String url;
}
