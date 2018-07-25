package com.example.demo.api;

import com.example.demo.api.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/user")
public interface UserApi {
    @RequestMapping(value = "/userInfo", produces = "application/json")
    User getUser();
}
