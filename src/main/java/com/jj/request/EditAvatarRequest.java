package com.jj.request;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * Created by yewangwang on 2016/5/15.
 */
public class EditAvatarRequest {
    private CommonsMultipartFile img;

    public CommonsMultipartFile getImg() {
        return img;
    }

    public void setImg(CommonsMultipartFile img) {
        this.img = img;
    }
}
