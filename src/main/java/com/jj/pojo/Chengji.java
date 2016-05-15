package com.jj.pojo;

import java.util.Date;

/**
 * Created by yewangwang on 2016/5/14.
 */
public class Chengji {
    private String xueshengId;
    private String kechengId;
    private Double chengji;
    private Integer isBukao;
    private Date createDate;

    public Chengji() {
        createDate = new Date();
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

    public Double getChengji() {
        return chengji;
    }

    public void setChengji(Double chengji) {
        this.chengji = chengji;
    }

    public Integer getIsBukao() {
        return isBukao;
    }

    public void setIsBukao(Integer isBukao) {
        this.isBukao = isBukao;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
