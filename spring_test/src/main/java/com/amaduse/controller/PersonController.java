package com.amaduse.controller;

import com.amaduse.dao.Person;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({Person.class})//使改配置文件可加载的
@RequestMapping("/person")
public class PersonController {
    @Autowired
    Person person;
    @ApiOperation(value = "查看person信息", notes = "查看person信息")
    @RequestMapping(value = "/showPersonInfoStr",method = RequestMethod.GET)
    public String showPersonInfoStr(){
        System.out.println(person.getUuid());
        System.out.println(person.getMax());
        System.out.println(person.getValue());
        return person.getName()+" "+person.getAge() +" "+person.getGreeting();
    }
}
