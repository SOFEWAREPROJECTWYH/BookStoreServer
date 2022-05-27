package com.wyh.bookstore.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String name;
    private String password;
    private String phonenumber;
    private String email;
    private Integer authority;
    private String shoppingtrolley;
    private String url;
    private String major;
}
