package com.yaohuaxiang.service;

import com.yaohuaxiang.User;

import java.util.List;

/**
 * @author yaohuaxiang
 * @create 2020/11/2 - 14:45
 */

public interface UserService {
    void addUser(User user);
    void deleteUserById(Integer uid);
    void updateUserById(User user);
    User getUserById(Integer uid);
    List<User> getUsers();
}
