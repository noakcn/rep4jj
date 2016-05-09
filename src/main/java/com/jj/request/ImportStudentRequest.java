package com.jj.request;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * Created by yewangwang on 2016/5/9.
 */
public class ImportStudentRequest {

    private String xueyuanId;
    private String zhuanyeId;
    private String banjiId;
    private CommonsMultipartFile file;

    public String getXueyuanId() {
        return xueyuanId;
    }

    public void setXueyuanId(String xueyuanId) {
        this.xueyuanId = xueyuanId;
    }

    public String getZhuanyeId() {
        return zhuanyeId;
    }

    public void setZhuanyeId(String zhuanyeId) {
        this.zhuanyeId = zhuanyeId;
    }

    public String getBanjiId() {
        return banjiId;
    }

    public void setBanjiId(String banjiId) {
        this.banjiId = banjiId;
    }

    public CommonsMultipartFile getFile() {
        return file;
    }

    public void setFile(CommonsMultipartFile file) {
        this.file = file;
    }
}
