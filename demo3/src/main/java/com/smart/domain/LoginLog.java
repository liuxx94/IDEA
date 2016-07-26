package com.smart.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by admin on 2016/7/25.
 */
public class LoginLog implements Serializable{

    private int loginLogId;
    private int userId;
    private String ip;
    private Date loginDate;

    public void setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public int getLoginLogId() {
        return loginLogId;
    }

    public int getUserId() {
        return userId;
    }

    public String getIp() {
        return ip;
    }

    public Date getLoginDate() {
        return loginDate;
    }
}
