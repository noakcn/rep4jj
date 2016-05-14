package com.jj.response;

import com.jj.pojo.Jiaoshi;
import com.jj.pojo.XueSheng;
import com.jj.utils.DateUtils;

/**
 * Created by yewangwang on 2016/5/5.
 */
public class JiaoshiResponse {
    private String userId;
    private String gonghao;
    private String xingming;
    private Integer xingbie;
    private String xingbieStr;
    private Long createDate;
    private Integer enable;
    private Long jobDate;
    private String jobDateStr;


    public JiaoshiResponse(Jiaoshi j) {
        this.userId=j.getUserId();
        this.gonghao=j.getGonghao();
        this.xingbieStr=j.getXingbie().getContent();
        this.xingming=j.getXingming();
        this.xingbie=j.getXingbie().getCode();
        this.createDate=j.getCreateDate().getTime();
        this.jobDate=j.getJobDate().getTime();
        this.jobDateStr= DateUtils.format(1,j.getJobDate());

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

    public Integer getXingbie() {
        return xingbie;
    }

    public void setXingbie(Integer xingbie) {
        this.xingbie = xingbie;
    }

    public String getXingbieStr() {
        return xingbieStr;
    }

    public void setXingbieStr(String xingbieStr) {
        this.xingbieStr = xingbieStr;
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

    public Long getJobDate() {
        return jobDate;
    }

    public void setJobDate(Long jobDate) {
        this.jobDate = jobDate;
    }

    public String getJobDateStr() {
        return jobDateStr;
    }

    public void setJobDateStr(String jobDateStr) {
        this.jobDateStr = jobDateStr;
    }
}
