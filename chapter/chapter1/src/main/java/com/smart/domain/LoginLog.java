package com.smart.domain;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by LENOVO on 2016/7/22.
 */

public class LoginLog implements Serializable {
    private int loginLogId;
    private int userId;
    private String ip;
    private Date loginDate;

    public void setLoginLogId(int loginLogId) {
        this.loginLogId = loginLogId;
    }

    public int getLoginLogId() {
        return this.loginLogId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return this.ip;
    }

    public void  setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public Date getLoginDate() {
        return this.loginDate;
    }
}