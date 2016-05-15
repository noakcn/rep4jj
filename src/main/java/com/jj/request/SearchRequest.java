package com.jj.request;

/**
 * Created by yewangwang on 2016/5/11.
 */
public class SearchRequest {
    private String zhuanyeId;
    private String xueyuanId;
    private String banjiId;
    private String kechengId;
    private String xingming;

    public String getKechengId() {
        return kechengId;
    }

    public void setKechengId(String kechengId) {
        this.kechengId = kechengId;
    }

    public String getZhuanyeId() {
        return zhuanyeId;
    }

    public void setZhuanyeId(String zhuanyeId) {
        this.zhuanyeId = zhuanyeId;
    }

    public String getXueyuanId() {
        return xueyuanId;
    }

    public void setXueyuanId(String xueyuanId) {
        this.xueyuanId = xueyuanId;
    }

    public String getBanjiId() {
        return banjiId;
    }

    public void setBanjiId(String banjiId) {
        this.banjiId = banjiId;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }
}
