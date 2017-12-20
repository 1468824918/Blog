package com.lanou.blog.mapper;

import com.lanou.blog.domain.Blog;
import com.lanou.blog.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by dllo on 17/12/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-cfg.xml")
public class BlogMapperTest {


    @Resource(name = "blogMapper")
    private BlogMapper blogMapper;
    @Test
    public void insert() throws Exception {
        Blog blog = new Blog("111","大连","111",10);
        blogMapper.insert(blog);
    }

    @Test
    public void findBlog() throws Exception {
        User user = new User(10,"韩信", "111", 1, "白白", "123456789", "大连");
        blogMapper.findBlog();
    }

    @Test
    public void update() throws Exception {

    }

    @Test
    public void delete() throws Exception {

    }

}