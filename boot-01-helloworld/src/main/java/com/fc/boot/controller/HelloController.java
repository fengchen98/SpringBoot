package com.fc.boot.controller;

import com.fc.boot.bean.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FCCC
 * @version 1.0
 * @date 2021/3/15 20:33
 */
@Slf4j
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String handle01(){
        return "Hello Spring Boot2!!!";
    }

    @Autowired
    Car car;


    @RequestMapping("/car")
    public Car car(){
        return car;
    }
}
