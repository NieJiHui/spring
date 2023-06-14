package com.nie.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Akihi
 * @date 2023/6/13 7:44 PM
 */
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

//    public User(String name) {
//        this.name = name;
//    }
    @Value("Akihi")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
