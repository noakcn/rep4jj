package com.jj.pojo;

import com.jj.utils.UUIDUtils;

/**
 * Created by yewangwang on 2016/5/8.
 */
public class Xueyuan {
    private String id;
    private String mingcheng;

    public Xueyuan() {
        this.id = UUIDUtils.generateId();
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
