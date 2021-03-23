package com.fc.boot.controller;

import com.fc.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:FC
 * @Date:2021/3/20
 * @Time:12:21
 * @Content:
 */
@RestController
public class HelloController {
    @Autowired
    Person person;

    @RequestMapping("/person")
    public Person person(){
        return person;
    }

}
