package com.njh.pojo;

/**
 * @author Akihi
 * @date 2023/6/8 8:25 PM
 */
public class Cat {
    private String name;

    public void cry(){
        System.out.println("miao~");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
