package com.jj.pojo;

import com.jj.pojo.enumclass.Enable;
import com.jj.pojo.enumclass.Sex;

import java.util.Date;

/**
 * Created by yewangwang on 2016/5/5.
 */
public class Jiaoshi {
    private String userId;
    private String gonghao;
    private String xingming;
    private Sex xingbie ;
    private Date createDate;
    private Enable enable;
    private Date jobDate;

    public Jiaoshi() {
        createDate=new Date();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGonghao() {
        return gonghao;
    }

    public void setGonghao(String gonghao) {
        this.gonghao = gonghao;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

    public Sex getXingbie() {
        return xingbie;
    }

    public void setXingbie(Sex xingbie) {
        this.xingbie = xingbie;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Enable getEnable() {
        return enable;
    }

    public void setEnable(Enable enable) {
        this.enable = enable;
    }

    public Date getJobDate() {
        return jobDate;
    }

    public void setJobDate(Date jobDate) {
        this.jobDate = jobDate;
    }
}
