package com.wyh.bookstore.entity;

import lombok.Data;

@Data
public class InStock {
    private Integer bookid;
    private String bookname;
    private Integer inprice;
    private Integer quantity;
    private String type;
    private String booksource;
    private String time;
}
