package com.nie.service;

/**
 * @author Akihi
 * @date 2023/6/14 8:57 PM
 */
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("Add a User.");
    }

    @Override
    public void del() {
        System.out.println("Delete a User.");

    }

    @Override
    public void update() {
        System.out.println("Update a User.");

    }

    @Override
    public void select() {
        System.out.println("Select a User.");

    }


}
