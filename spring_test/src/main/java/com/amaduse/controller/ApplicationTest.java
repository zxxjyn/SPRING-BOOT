package com.amaduse.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationTest {
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private int age;


    //只用输入方法名，访问是url会自动的加上 '/'
    @RequestMapping("showMessage")
    public String showProperties(){
        return name+":"+age;
    }
}
