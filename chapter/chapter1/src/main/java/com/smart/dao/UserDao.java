package com.smart.dao;

import com.smart.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by LENOVO on 2016/7/22.
 */
@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public int getMatchCount (String userName, String password) {
        String sqlstr = "SELECT count(*) FROM t_user WHERE user_name = ? and password = ? ";
        return jdbcTemplate.queryForInt(sqlstr, new Object[]{userName, password});
    }

    public User findUserByUserName(final String userName) {
        String sqlstr = "SELECT user_id,user_name FROM t_user WHERE user_name = ? ";
        final User user = new User();
        jdbcTemplate.query(sqlstr, new Object[]{userName},
                new RowCallbackHandler() {
                    public void processRow(ResultSet rs) throws SQLException {
                        user.setUserId(rs.getInt("user_id"));
                        user.setUserName(userName);
                    }
                });
        return user;
    }

    public void updateLoginInfo(User user) {
        String sqlstr = "UPDATE t_user SET last_visit = ?, last_ip = ? WHERE user_id = ? ";
        jdbcTemplate.update(sqlstr, new Object[] { user.getLastVisit(), user.getLastIp(), user.getUserId()});

    }
}
