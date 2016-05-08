package com.jj.pojo.enumclass;

/**
 * Created by yewangwang on 2016/5/5.
 */
public enum Enable {
    DISABLE(0, "不可用"),
    ENABLE(1, "可用"),
    ;

    private int code;
    private String content;

    Enable(int code, String content) {
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
