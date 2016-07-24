package com.smart.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by LENOVO on 2016/7/22.
 */
public class User implements Serializable {
    private int userId;
    private String userName;
    private String password;
    private String lastIp;
    private Date lastVisit;

    public void setUserId(int userId) {

        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public void setLastVisit(Date lastVisit) {
        this.lastVisit = lastVisit;
    }

    public int getUserId() {
        return this.userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }

    public String getLastIp() {
        return this.lastIp;
    }

    public Date getLastVisit() {
        return this.lastVisit;
    }
}
