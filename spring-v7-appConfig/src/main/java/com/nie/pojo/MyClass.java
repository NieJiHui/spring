package com.nie.pojo;

/**
 * @author Akihi
 * @date 2023/6/13 7:59 PM
 */
public class MyClass {
    long var;

    public void MyClass(long param) {
        var = param;
    }

    public static void main(String[] args) {
        MyClass A, B;
        A = new MyClass();
////2
//        B = new MyClass(5);//3)
    }
}
