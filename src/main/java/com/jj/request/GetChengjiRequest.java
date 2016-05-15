package com.jj.request;

import org.springframework.util.StringUtils;

/**
 * Created by yewangwang on 2016/5/15.
 */
public class GetChengjiRequest {
    private String kechengId;
    private String kechengmingcheng;

    public String getKechengmingcheng() {
        if (StringUtils.isEmpty(kechengmingcheng)) return null;
        return kechengmingcheng;
    }

    public void setKechengmingcheng(String kechengmingcheng) {
        this.kechengmingcheng = kechengmingcheng;
    }

    public String getKechengId() {
        if (StringUtils.isEmpty(kechengId))
            return null;
        return kechengId;
    }

    public void setKechengId(String kechengId) {
        this.kechengId = kechengId;
    }
}
