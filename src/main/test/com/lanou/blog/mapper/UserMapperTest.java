package com.lanou.blog.mapper;

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
public class UserMapperTest {



    @Resource(name = "userMapper")
    private UserMapper userMapper;

    @Test
    public void insert() throws Exception {
        User user = new User("李白", "111", 1, "白白", "123456789", "大连");
        userMapper.insert(user);
    }

    @Test
    public void login() throws Exception {
        User user = new User("韩信", "111", 1, "白白", "123456789", "大连");
        userMapper.login(user);
    }

    @Test
    public void update() throws Exception {
        User user = new User(10,"韩信", "111", 1, "白白", "123456789", "大连");
        int i = userMapper.update(user);
        System.out.println(i);
    }

    @Test
    public void delete() throws Exception {
        User user = new User("李白", "111", 1, "白白", "123456789", "大连");
        userMapper.delete(user);
    }

}