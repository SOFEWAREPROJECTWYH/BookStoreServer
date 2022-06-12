package com.wyh.bookstore.entity;

import lombok.Data;

@Data
public class WaitForReceiving {
    private Integer id;
    private String name;
    private Integer bookid;
    private String bookname;
    private String quantity;
    private String location;
}
