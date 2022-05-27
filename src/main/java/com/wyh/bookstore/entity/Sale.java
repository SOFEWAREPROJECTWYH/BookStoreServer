package com.wyh.bookstore.entity;

import lombok.Data;

@Data
public class Sale {
    private Integer bookid;
    private String bookname;
    private Integer outprice;
    private Integer quantity;
    private String type;
    private Integer customerid;
    private Integer customername;
    private String time;
}
