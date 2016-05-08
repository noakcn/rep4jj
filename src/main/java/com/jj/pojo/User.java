package com.jj.pojo;

import com.jj.pojo.enumclass.Enable;
import com.jj.pojo.enumclass.Role;

/**
 * Created by yewangwang on 2016/5/5.
 */
public class User {
    private String id;
    private String username;
    private String password;
    private Role role;
    private Enable enable;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Enable getEnable() {
        return enable;
    }

    public void setEnable(Enable enable) {
        this.enable = enable;
    }
}
