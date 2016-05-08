package com.jj.pojo.enumclass;

/**
 * Created by yewangwang on 2016/5/5.
 */
public enum Role {
    UNKNOW(0, "未知"),
    ADMIN(1, "管理员"),
    TEACHER(2, "教师"),
    STUDENT(3, "学生");

    private int code;
    private String content;

    Role(int code, String content) {
        this.code = code;
        this.content = content;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
