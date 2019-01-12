package com.amaduse.controller;

import com.amaduse.dao.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({Person.class})//使改配置文件可加载的
public class PersonController {
    @Autowired
    Person person;
    @RequestMapping("showPersonInfoStr")
    public String showPersonInfoStr(){
        System.out.println(person.getUuid());
        System.out.println(person.getMax());
        System.out.println(person.getValue());
        return person.getName()+" "+person.getAge() +" "+person.getGreeting();
    }
}
