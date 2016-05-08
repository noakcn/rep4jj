package com.jj.pojo;

import com.jj.utils.UUIDUtils;

/**
 * Created by yewangwang on 2016/5/8.
 */
public class Zhuanye {
    private String id;
    private String mingcheng;
    private String xueyuanId;


    public Zhuanye() {
    }

    public Zhuanye(ZhuanyeSettingRequest requestObject) {
        this.id= UUIDUtils.generateId();
        this.mingcheng=requestObject.getMingcheng();
        this.xueyuanId=requestObject.getXueyuanId();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMingcheng() {
        return mingcheng;
    }

    public void setMingcheng(String mingcheng) {
        this.mingcheng = mingcheng;
    }

    public String getXueyuanId() {
        return xueyuanId;
    }

    public void setXueyuanId(String xueyuanId) {
        this.xueyuanId = xueyuanId;
    }
}
