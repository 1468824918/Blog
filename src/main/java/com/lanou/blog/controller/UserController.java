package com.lanou.blog.controller;

import com.lanou.blog.domain.User;
import com.lanou.blog.mapper.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by dllo on 17/12/4.
 */
@Controller
public class UserController {
    @Resource(name = "userMapper")
    private UserMapper userMapper;

    //用户登录
    @RequestMapping("/login")
    @ResponseBody
    public String login(User user){
        User users = userMapper.login(user);
        if (users==null||!user.getUserName().equals(users.getUserName())||!user.getPassword().equals(users.getPassword())){
            return "error";
        }else {
            return "success";
        }
    }


    //跳转博客页面
    @RequestMapping("Blog")
    public String success(){
        return "blog";
    }

    //跳转注册页面
    @RequestMapping("/registers")
    public String registers(){
        return "register";
    }

    //注册
    @RequestMapping("/register")
    @ResponseBody
    public String register(User user, String againPassword){
        userMapper.insert(user);
        return "login";
    }

    //错误页面
    @RequestMapping("error")
    public String error(){
        return "error";
    }

    @RequestMapping("againLogin")
    public String againLogin(){
        return "login";
    }

}
