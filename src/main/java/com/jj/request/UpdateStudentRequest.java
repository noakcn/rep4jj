package com.jj.request;

import com.jj.pojo.Banji;
import com.jj.pojo.enumclass.Enable;
import com.jj.pojo.enumclass.Sex;

import java.util.Date;

/**
 * Created by yewangwang on 2016/5/5.
 */
public class UpdateStudentRequest {
    private String userId;
    private String xuehao;
    private String xingming;
    private Integer xingbie;


    public UpdateStudentRequest() {

    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getXuehao() {
        return xuehao;
    }

    public void setXuehao(String xuehao) {
        this.xuehao = xuehao;
    }

    public String getXingming() {
        return xingming;
    }

    public void setXingming(String xingming) {
        this.xingming = xingming;
    }

    public Integer getXingbie() {
        return xingbie;
    }

    public void setXingbie(Integer xingbie) {
        this.xingbie = xingbie;
    }
}
