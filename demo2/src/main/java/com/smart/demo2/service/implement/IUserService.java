package com.smart.demo2.service.implement;
import com.smart.demo2.dao.UserDao;
import com.smart.demo2.entities.User;
import com.smart.demo2.service.UserService;

/**
 * Created by LENOVO on 2016/7/24.
 */
public class IUserService implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser(User entity) {

        userDao.saveUser(entity);
    }
}
