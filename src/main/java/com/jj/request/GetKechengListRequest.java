package com.jj.request;

import org.springframework.util.StringUtils;

/**
 * Created by yewangwang on 2016/5/14.
 */
public class GetKechengListRequest {
    private String xueyuanId;
    private String mingcheng;

    public String getXueyuanId() {
        if(StringUtils.isEmpty(xueyuanId))
            return null;
        return xueyuanId;
    }

    public void setXueyuanId(String xueyuanId) {
        this.xueyuanId = xueyuanId;
    }

    public String getMingcheng() {
        if(StringUtils.isEmpty(mingcheng))return null;
        return mingcheng;
    }

    public void setMingcheng(String mingcheng) {
        this.mingcheng = mingcheng;
    }
}
