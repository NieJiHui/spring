package com.njh.service;

import com.njh.dao.UserDao;
import com.njh.dao.UserDaoImpl;

/**
 * @author Akihi
 * @date 2023/6/6 10:37 AM
 */
public class UserServiceImpl implements UserService{
    //
    private UserDao userDao;

    //使用set进行动态注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    // 真正获取User是通过Dao
    @Override
    public void getUser() {
        userDao.getUser();
    }
}
