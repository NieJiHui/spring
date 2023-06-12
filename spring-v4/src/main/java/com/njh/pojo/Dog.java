package com.njh.pojo;

/**
 * @author Akihi
 * @date 2023/6/8 8:24 PM
 */
public class Dog {
    private String name;

    public void cry(){
        System.out.println("wang~");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
