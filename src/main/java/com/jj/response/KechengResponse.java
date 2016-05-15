package com.jj.response;

import com.jj.pojo.Kecheng;
import com.jj.pojo.XueSheng;
import com.jj.pojo.Xueyuan;
import com.jj.pojo.enumclass.KechengType;
import com.jj.response.XueyuanResponse;
import com.jj.utils.UUIDUtils;

import java.util.List;

/**
 * Created by yewangwang on 2016/5/14.
 */
public class KechengResponse {
    private String id;
    private String kechengmingcheng;
    private Integer zongkeshi;
    private Double xuefeng;
    private Integer type;
    private String typeStr;
    private String xueyuanId;
    private XueyuanResponse xueyuan;
    private String status;
    private List<XueShengResponse> xueShengs;

    private Double chengji;

    public KechengResponse(Kecheng o) {
        this.id = o.getId();
        this.kechengmingcheng = o.getKechengmingcheng();
        this.zongkeshi = o.getZongkeshi();
        this.xuefeng = o.getXuefeng();
        this.typeStr = o.getType()!=null?o.getType().getContent():null;
        this.xueyuan = o.getXueyuanId()!=null?new XueyuanResponse(o.getXueyuan()):null;
    }

    public Double getChengji() {
        return chengji;
    }

    public void setChengji(Double chengji) {
        this.chengji = chengji;
    }

    public List<XueShengResponse> getXueShengs() {
        return xueShengs;
    }

    public void setXueShengs(List<XueShengResponse> xueShengs) {
        this.xueShengs = xueShengs;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTypeStr() {
        return typeStr;
    }

    public void setTypeStr(String typeStr) {
        this.typeStr = typeStr;
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

    public XueyuanResponse getXueyuan() {
        return xueyuan;
    }

    public void setXueyuan(XueyuanResponse xueyuan) {
        this.xueyuan = xueyuan;
    }
}
