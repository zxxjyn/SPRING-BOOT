package com.amaduse.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @RequestMapping("/index")
    public String index(){
        return "welcome to my project";
    }
}
