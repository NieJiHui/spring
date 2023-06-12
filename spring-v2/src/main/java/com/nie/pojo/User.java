package com.nie.pojo;

/**
 * @author Akihi
 * @date 2023/6/6 3:55 PM
 */
public class User {
    private String name;
    private String id;
    public User() {
    }

    public User(String name,String id) {
        System.out.println("User的有参构造器");
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
