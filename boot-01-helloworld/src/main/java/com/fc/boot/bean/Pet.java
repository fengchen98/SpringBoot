package com.fc.boot.bean;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
 * @author FCCC
 * @version 1.0
 * @date 2021/3/16 20:08
 */


/**
 * 宠物
 */
@ToString
@Data
@NoArgsConstructor  //无参构造器
@AllArgsConstructor  //全参构造器
public class Pet {

    private String name;

    public Pet(String tomcat) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
