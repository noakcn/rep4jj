package com.jj.pojo.enumclass;

/**
 * Created by yewangwang on 2016/5/5.
 */
public enum KechengType {
    UNKONW(0, "不可用"),
    CHOICE_COURSE(1, "限选课"),
    MUST_COURSE(2, "必修课"),
    ;

    private int code;
    private String content;

    KechengType(int code, String content) {
        this.code = code;
        this.content = content;
    }

    public static KechengType findByCode(int code){
        for(KechengType k:KechengType.values()){
            if(k.getCode()==code){
                return k;
            }
        }
        return UNKONW;
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
