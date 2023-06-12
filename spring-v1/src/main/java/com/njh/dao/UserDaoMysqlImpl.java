package com.njh.dao;

import com.njh.service.UserServiceImpl;

/**
 * @author Akihi
 * @date 2023/6/6 10:45 AM
 */
public class UserDaoMysqlImpl implements UserDao{

    @Override
    public void getUser() {
        System.out.println("Mysql"+ " " + "getUser");
    }
}
