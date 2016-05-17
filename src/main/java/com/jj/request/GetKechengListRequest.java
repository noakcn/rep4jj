package com.jj.request;

import org.springframework.util.StringUtils;

/**
 * Created by yewangwang on 2016/5/14.
 */
public class GetKechengListRequest {
    private String xueyuanId;
    private String kechengmingcheng;

    public String getXueyuanId() {
        if(StringUtils.isEmpty(xueyuanId))
            return null;
        return xueyuanId;
    }

    public void setXueyuanId(String xueyuanId) {
        this.xueyuanId = xueyuanId;
    }

    public String getKechengmingcheng() {
        if(StringUtils.isEmpty(kechengmingcheng))
            return null;
        return kechengmingcheng;
    }

    public void setKechengmingcheng(String kechengmingcheng) {
        this.kechengmingcheng = kechengmingcheng;
    }


}
