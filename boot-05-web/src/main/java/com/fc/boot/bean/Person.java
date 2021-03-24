package com.fc.boot.bean;

import lombok.Data;

import java.util.Date;

/**
 * @Author:FC
 * @Date:2021/3/20
 * @Time:15:18
 * @Content:
 */
@Data
public class Person {

        private String userName;
        private Integer age;
        private Date birth;
        private Pet pet;
}
