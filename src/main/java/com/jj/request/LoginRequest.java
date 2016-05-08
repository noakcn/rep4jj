package com.jj.request;

/**
 * Created by yewangwang on 2016/5/5.
 */
public class LoginRequest {
    private String username;
    private String password;
    private Boolean holdLogin;

    public Boolean getHoldLogin() {
        return holdLogin;
    }

    public void setHoldLogin(Boolean holdLogin) {
        this.holdLogin = holdLogin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
