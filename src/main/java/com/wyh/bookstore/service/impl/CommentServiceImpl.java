package com.wyh.bookstore.service.impl;

import com.wyh.bookstore.dao.CommentDao;
import com.wyh.bookstore.entity.Comment;
import com.wyh.bookstore.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentDao commentDao;
    @Override
    public List<Comment> getCommentInfo() {
        return commentDao.getCommentInfo();
    }

    @Override
    public List<Comment> getSearchCommentInfo(Comment comment) {
        return commentDao.getSearchCommentInfo(comment);
    }
}
