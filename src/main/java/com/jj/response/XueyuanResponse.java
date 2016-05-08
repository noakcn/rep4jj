package com.jj.response;

import com.jj.pojo.Xueyuan;

/**
 * Created by yewangwang on 2016/5/8.
 */
public class XueyuanResponse {
    private String id;
    private String mingcheng;

    public XueyuanResponse(Xueyuan o) {
        this.id = o.getId();
        this.mingcheng = o.getMingcheng();
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
}
