package com.yaohuaxiang.controller;

import com.yaohuaxiang.User;
import com.yaohuaxiang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yaohuaxiang
 * @create 2020/11/2 - 14:49
 */

@RestController
@RequestMapping("/provider")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/user/{uid}")
    public User getUserById(@PathVariable("uid")Integer uid){
        return userService.getUserById(uid);
    }

    @PostMapping("/user")
    public void addUser(User user){
        userService.addUser(user);
    }

    @PutMapping("/user")
    public void updateUser(User user){
        userService.updateUserById(user);
    }

    @DeleteMapping("/user/{uid}")
    public void deleteUserById(@PathVariable("uid")Integer uid){
        userService.deleteUserById(uid);
    }
}
