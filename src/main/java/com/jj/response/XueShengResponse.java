package com.jj.response;

import com.jj.pojo.XueSheng;
import com.jj.pojo.enumclass.Enable;
import com.jj.pojo.enumclass.Sex;
import com.jj.utils.DateUtils;

import java.util.Date;

/**
 * Created by yewangwang on 2016/5/5.
 */
public class XueShengResponse {
    private String userId;
    private String xuehao;
    private String xingming;
    private Integer xingbie;
    private String xingbieStr;
    private Long createDate;
    private Integer enable;
    private Long ruxueDate;
    private String ruxueDateStr;
    private String banjiId;
    private BanjiResponse banji;
    private String mingcheng;

    public XueShengResponse(XueSheng xs) {
        this.userId=xs.getUserId();
        this.xuehao=xs.getXuehao();
        this.xingbieStr=xs.getXingbie().getContent();
        this.xingming=xs.getXingming();
        this.xingbie=xs.getXingbie().getCode();
        this.createDate=xs.getCreateDate().getTime();
        this.ruxueDate=xs.getRuxueDate().getTime();
        this.ruxueDateStr= DateUtils.format(1,xs.getRuxueDate());
        this.banjiId=xs.getBanjiId();
        this.banji=new BanjiResponse(xs.getBanji());
        this.mingcheng=banji.getMingcheng();
    }

    public String getMingcheng() {
        return mingcheng;
    }

    public void setMingcheng(String mingcheng) {
        this.mingcheng = mingcheng;
    }

    public BanjiResponse getBanji() {
        return banji;
    }

    public void setBanji(BanjiResponse banji) {
        this.banji = banji;
    }


    public String getXingbieStr() {
        return xingbieStr;
    }

    public void setXingbieStr(String xingbieStr) {
        this.xingbieStr = xingbieStr;
    }

    public String getRuxueDateStr() {
        return ruxueDateStr;
    }

    public void setRuxueDateStr(String ruxueDateStr) {
        this.ruxueDateStr = ruxueDateStr;
    }

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

    public Integer getXingbie() {
        return xingbie;
    }

    public void setXingbie(Integer xingbie) {
        this.xingbie = xingbie;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public Long getRuxueDate() {
        return ruxueDate;
    }

    public void setRuxueDate(Long ruxueDate) {
        this.ruxueDate = ruxueDate;
    }

    public String getBanjiId() {
        return banjiId;
    }

    public void setBanjiId(String banjiId) {
        this.banjiId = banjiId;
    }
}
