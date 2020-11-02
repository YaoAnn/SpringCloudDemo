package com.yaohuaxiang.service.impl;

import com.yaohuaxiang.User;
import com.yaohuaxiang.dao.UserDao;
import com.yaohuaxiang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yaohuaxiang
 * @create 2020/11/2 - 14:46
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void deleteUserById(Integer uid) {
        userDao.deleteUserById(uid);
    }

    @Override
    public void updateUserById(User user) {
        userDao.updateUserById(user);
    }

    @Override
    public User getUserById(Integer uid) {
        return userDao.getUserById(uid);
    }

    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }
}
