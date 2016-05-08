package com.jj.pojo;

import com.jj.pojo.enumclass.Enable;
import com.jj.pojo.enumclass.Sex;

import java.util.Date;

/**
 * Created by yewangwang on 2016/5/5.
 */
public class XueSheng {
    private String userId;
    private String xuehao;
    private String xingming;
    private Sex xingbie;
    private Date createDate;
    private Enable enable;
    private Date ruxueDate;
    private String banjiId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getXuehao() {
        return xuehao;
    }

    public void setXuehao(String xuehao) {
        this.xuehao = xuehao;
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

    public Date getRuxueDate() {
        return ruxueDate;
    }

    public void setRuxueDate(Date ruxueDate) {
        this.ruxueDate = ruxueDate;
    }

    public String getBanjiId() {
        return banjiId;
    }

    public void setBanjiId(String banjiId) {
        this.banjiId = banjiId;
    }
}
