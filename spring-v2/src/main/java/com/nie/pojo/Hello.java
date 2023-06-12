package com.nie.pojo;

/**
 * @author Akihi
 * @date 2023/6/6 11:04 AM
 */
public class Hello {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Hello" + " " + name);
    }

}
