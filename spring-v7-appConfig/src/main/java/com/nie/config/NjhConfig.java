package com.nie.config;

import com.nie.pojo.User;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author Akihi
 * @date 2023/6/13 8:15 PM
 */
@Configuration
//扫描
@ComponentScan("com.nie.pojo")
@Import(Config2.class)
public class NjhConfig {

    //注册Bean相当于之前写的bean标签
    // 方法名就是bean标签中的id
    // 方法返回值就是xml中的class
    @Bean
    public User getUser(){
        return new User();
    }

}
