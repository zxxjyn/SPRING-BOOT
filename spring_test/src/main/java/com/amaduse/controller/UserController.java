package com.amaduse.controller;

import com.amaduse.entity.User;
import com.amaduse.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @ApiOperation(value = "用户列表", notes="用户列表")
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public User getUser(@PathVariable("name") String name){
        return userService.findUserByName(name);
    }

    @ApiOperation(value = "获取用户信息", notes = "更具url的name来获取用户信息")
    @RequestMapping(value = "/all", method =  RequestMethod.GET )
    public List<User> all() {
        return userService.findAll();
    }
}
