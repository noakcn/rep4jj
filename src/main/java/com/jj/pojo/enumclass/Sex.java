package com.jj.pojo.enumclass;

/**
 * Created by yewangwang on 2016/5/5.
 */
public enum Sex {
    UNKNOW(0, "未知"),
    MAN(1, "男"),
    FEMALE(2,"女")
    ;

    private int code;
    private String content;

    Sex(int code, String content) {
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
