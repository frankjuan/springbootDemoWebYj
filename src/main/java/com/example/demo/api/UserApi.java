package com.example.demo.api;

import com.example.demo.api.entity.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/user")
public interface UserApi {
    @ApiOperation(value="一个测试API",notes = "第一个测试api")
    @RequestMapping(value = "/userInfo", produces = "application/json")
    User getUser();
}
