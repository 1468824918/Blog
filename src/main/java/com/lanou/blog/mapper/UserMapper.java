package com.lanou.blog.mapper;

import com.lanou.blog.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by dllo on 17/12/4.
 */
@Repository
public interface UserMapper {
    //用户注册
    void insert(User user);

    //用户登录
    User login(User user);

    //修改用户
    int update(User user);

    //删除用户
    int delete(User user);
}
