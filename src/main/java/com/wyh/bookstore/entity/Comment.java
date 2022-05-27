package com.wyh.bookstore.entity;

import lombok.Data;

@Data
public class Comment {
    private String name;
    private String url;
    private String title;
    private String content;
    private String bookurl;
    private String like;
    private String comment;
    private String share;
}
