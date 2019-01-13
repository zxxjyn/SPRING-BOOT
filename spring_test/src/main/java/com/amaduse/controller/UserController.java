package com.amaduse.controller;

import com.amaduse.entity.User;
import com.amaduse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("{name}")
    public User getUser(@PathVariable("name") String name){
        return userService.findUserByName(name);
    }
}
