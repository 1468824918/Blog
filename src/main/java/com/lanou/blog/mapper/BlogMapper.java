package com.lanou.blog.mapper;

import com.lanou.blog.domain.Blog;
import com.lanou.blog.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dllo on 17/12/4.
 */
@Repository
public interface BlogMapper {
    //插入博客
    int insert(Blog blog);

    List<Blog> findBlog();

    Blog find();

    int update(Blog blog);

    int delete(Blog blog);
}
