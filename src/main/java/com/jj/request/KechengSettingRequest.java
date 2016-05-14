package com.jj.request;

/**
 * Created by yewangwang on 2016/5/8.
 */
public class KechengSettingRequest {
    private String kechengmingcheng;
    private Integer zongkeshi;
    private Double xuefeng ;
    private Integer type;
    private String xueyuanId;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getXueyuanId() {
        return xueyuanId;
    }

    public void setXueyuanId(String xueyuanId) {
        this.xueyuanId = xueyuanId;
    }
}
