package com.smart.service;

import com.smart.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * Created by admin on 2016/7/26.
 */
@ContextConfiguration(locations={"/applicationContext.xml"})
public class UserServiceTest extends AbstractTestNGSpringContextTests{

    @Autowired
    private UserService userService;

    @Test
    public void hasMatchUser() {
        boolean b1 = userService.hasMatchUser("admin", "123456");
        boolean b2 = userService.hasMatchUser("admin", "1234");
        Assert.assertTrue(b1);
        Assert.assertTrue(b2);
    }

    @Test
    public void findUserByUserName() {
        User user = userService.findUserByUserName("admin");
        Assert.assertEquals(user.getUserName(), "admin");
    }

    @Test
    public void loginSuccess() {

        User user = new User();
        user.setUserName("admin");
        user.setPassword("1234");
        boolean pre = userService.hasMatchUser("admin", "1234");
        userService.loginSuccess(user);
        boolean cur = userService.hasMatchUser("admin", "1234");
        Assert.assertEquals(pre, false);
        Assert.assertEquals(cur, true);
    }
}
