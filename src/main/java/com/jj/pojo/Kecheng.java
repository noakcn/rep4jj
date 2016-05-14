package com.jj.pojo;

import com.jj.pojo.enumclass.KechengType;
import com.jj.utils.UUIDUtils;

/**
 * Created by yewangwang on 2016/5/14.
 */
public class Kecheng {
    private String id;
    private String kechengmingcheng;
    private Integer zongkeshi;
    private Double xuefeng;
    private KechengType type;
    private String xueyuanId;
    private Xueyuan xueyuan;

    public Kecheng() {
        id= UUIDUtils.generateId();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKechengmingcheng() {
        return kechengmingcheng;
    }

    public void setKechengmingcheng(String kechengmingcheng) {
        this.kechengmingcheng = kechengmingcheng;
    }

    public Integer getZongkeshi() {
        return zongkeshi;
    }

    public void setZongkeshi(Integer zongkeshi) {
        this.zongkeshi = zongkeshi;
    }

    public Double getXuefeng() {
        return xuefeng;
    }

    public void setXuefeng(Double xuefeng) {
        this.xuefeng = xuefeng;
    }

    public KechengType getType() {
        return type;
    }

    public void setType(KechengType type) {
        this.type = type;
    }

    public String getXueyuanId() {
        return xueyuanId;
    }

    public void setXueyuanId(String xueyuanId) {
        this.xueyuanId = xueyuanId;
    }

    public Xueyuan getXueyuan() {
        return xueyuan;
    }

    public void setXueyuan(Xueyuan xueyuan) {
        this.xueyuan = xueyuan;
    }
}
