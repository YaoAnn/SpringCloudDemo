package com.yaohuaxiang.controller;

import com.yaohuaxiang.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author yaohuaxiang
 * @create 2020/11/2 - 15:12
 */

@RestController
@RequestMapping("/consumer")
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/users")
    public List<User> getUsers(){
        List<User> users = restTemplate.getForObject("http://provider-9001/provider/users", List.class);
        return users;
    }

    @GetMapping("/user/{uid}")
    public User getUserById(@PathVariable("uid")Integer uid){
        User user = restTemplate.getForObject("http://provider-9001/provider/user/" + uid, User.class);
        return user;
    }

}
