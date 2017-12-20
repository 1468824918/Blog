package com.lanou.blog.controller;

import com.lanou.blog.domain.Blog;
import com.lanou.blog.mapper.BlogMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/12/4.
 */
@Controller
public class BlogController {
    @Resource(name = "blogMapper")
    private BlogMapper blogMapper;

    //插博客
    @RequestMapping("/blog")
    @ResponseBody
    public String insertBlog(Blog blog){
        blogMapper.insert(blog);
        return "success";
    }

    //查询所有博客
    @RequestMapping("findBlog")
    @ResponseBody
    public List<Blog> findBlog(){
        return blogMapper.findBlog();
    }

    //跳转到看博客页面
    @RequestMapping("look")
    public String look(){
        return "lookBlog";
    }

    @RequestMapping("success")
    public String success(){
        return "success";
    }
}
