package com.wyh.bookstore.controller;

import com.wyh.bookstore.entity.Comment;
import com.wyh.bookstore.entity.Comments;
import com.wyh.bookstore.entity.Sale;
import com.wyh.bookstore.service.CommentService;
import com.wyh.bookstore.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ResponseBody
@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/comment",method = RequestMethod.GET)
    public Comments getBookInfo() {
        List<Comment> commentList = commentService.getCommentInfo();
        Comments comments=new Comments(commentList);
        return comments;
    }
}
