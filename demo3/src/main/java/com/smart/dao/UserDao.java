package com.smart.dao;

import com.smart.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by admin on 2016/7/25.
 */

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int getMatchCount(String userName, String password) {
        String sqlStr = "SELECT count(*) FROM t_user" +
                "WHERE user_name =? and password =? ";
        return jdbcTemplate.queryForObject(sqlStr,
                new Object[] {userName, password}, Integer.class);
    }

    public User findUserByUserName(final String userName) {
        final User user = new User();
        String sqlStr = "SELECT user_id,user_name FROM t_user" +
                "WHERE user_name =? ";
        jdbcTemplate.query(sqlStr, new Object[] { userName },
                new RowCallbackHandler() {
                    public void processRow(ResultSet rs) throws SQLException {
                        user.setUserId(rs.getInt("user_id"));
                        user.setUserName(userName);
                    }
                });
        return user;
    }

    public void updateLoginInfo() {
        User user = new User();
        String sqlStr = "UPDATE t_user SET last_visit=?,last_id=? " +
                "WHERE user_id =? ";
        jdbcTemplate.update(sqlStr, new Object[] {
                user.getLastVisit(), user.getLastIp(), user.getUserId()
        });

    }
}
