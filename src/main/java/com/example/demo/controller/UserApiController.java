package com.example.demo.controller;

import com.example.demo.api.UserApi;
import com.example.demo.api.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserApiController implements UserApi {
    @Autowired
    private UserService userService;

    @Override
    public User getUser(){
        return userService.findUser();
    }
}
