package com.jj.response;

import com.jj.pojo.Banji;
import com.jj.utils.UUIDUtils;

/**
 * Created by yewangwang on 2016/5/8.
 */
public class BanjiResponse {
    private String id;
    private String mingcheng;
    private Integer nianji;
    private String zhuanyeId;



    public BanjiResponse(Banji b) {
        id=b.getId();
        this.mingcheng=b.getMingcheng();
        this.nianji=b.getNianji();
        this.zhuanyeId=b.getZhuanyeId();
    }

    public String getZhuanyeId() {
        return zhuanyeId;
    }

    public void setZhuanyeId(String zhuanyeId) {
        this.zhuanyeId = zhuanyeId;
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

    public Integer getNianji() {
        return nianji;
    }

    public void setNianji(Integer nianji) {
        this.nianji = nianji;
    }
}
