package com.smart.demo2.dao.implement;
import com.smart.demo2.dao.UserDao;
import com.smart.demo2.entities.User;

/**
 * Created by LENOVO on 2016/7/24.
 */
public class IUserDao implements UserDao {

    public void saveUser(User entity) {

        System.out.println("----saveUser() from UserDao");
    }
}
