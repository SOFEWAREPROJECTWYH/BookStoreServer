package com.wyh.bookstore.service;

import com.wyh.bookstore.entity.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getCommentInfo();
    List<Comment> getSearchCommentInfo(Comment comment);
}
