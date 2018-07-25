package com.example.demo.service.impl;

import com.example.demo.api.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findUser() {
        User user = new User();
        user.setAge(19);
        user.setName("小明");
        user.setProfile("Hello, Are you Ok!");
        return user;
    }
}
