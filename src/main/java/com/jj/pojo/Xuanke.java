package com.jj.pojo;

import com.jj.pojo.enumclass.Enable;

import java.util.Date;

/**
 * Created by yewangwang on 2016/5/14.
 */
public class Xuanke {
    private String xueshengId;
    private String kechengId;
    private Enable enable;
    private Date createDate;

    public Xuanke() {
        createDate=new Date();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getXueshengId() {
        return xueshengId;
    }

    public void setXueshengId(String xueshengId) {
        this.xueshengId = xueshengId;
    }

    public String getKechengId() {
        return kechengId;
    }

    public void setKechengId(String kechengId) {
        this.kechengId = kechengId;
    }

    public Enable getEnable() {
        return enable;
    }

    public void setEnable(Enable enable) {
        this.enable = enable;
    }
}
