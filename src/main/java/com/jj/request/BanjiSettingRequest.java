package com.jj.request;

/**
 * Created by yewangwang on 2016/5/8.
 */
public class BanjiSettingRequest {
    private String xueyuanId;
    private String zhuanyeId;
    private String mingcheng;
    private Integer nianji;

    public Integer getNianji() {
        return nianji;
    }

    public void setNianji(Integer nianji) {
        this.nianji = nianji;
    }

    public String getXueyuanId() {
        return xueyuanId;
    }

    public void setXueyuanId(String xueyuanId) {
        this.xueyuanId = xueyuanId;
    }

    public String getZhuanyeId() {
        return zhuanyeId;
    }

    public void setZhuanyeId(String zhuanyeId) {
        this.zhuanyeId = zhuanyeId;
    }

    public String getMingcheng() {
        return mingcheng;
    }

    public void setMingcheng(String mingcheng) {
        this.mingcheng = mingcheng;
    }
}
