package com.wyh.bookstore.dao;

import com.wyh.bookstore.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CommentDao {
    List<Comment> getCommentInfo();
    List<Comment> getSearchCommentInfo();
}
