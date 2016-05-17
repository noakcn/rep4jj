package com.jj.service;

import com.jj.dao.IXueyuanDao;
import com.jj.pojo.Xueyuan;
import com.jj.request.XueyuanSettingRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yewangwang on 2016/5/8.
 */
@Service
public class XueyuanSettingService {

    @Autowired
    private IXueyuanDao xueyuanDao;

    public String add(XueyuanSettingRequest requestObject, HttpServletRequest request) {
        if (StringUtils.isEmpty(requestObject.getMingcheng())) {
            request.setAttribute("result", "fail");
            request.setAttribute("msg", "名称为空");
            return "fail";
        }
        if(xueyuanDao.isExist(requestObject.getMingcheng())){
            request.setAttribute("result", "fail");
            request.setAttribute("msg", "已存在");
            request.setAttribute("mingcheng", requestObject.getMingcheng());
            return "fail";
        }
        Xueyuan xueyuan = new Xueyuan();
        xueyuan.setMingcheng(requestObject.getMingcheng());
        xueyuanDao.save(xueyuan);
        request.setAttribute("result", "success");
        request.setAttribute("msg", "添加成功");
        request.setAttribute("mingcheng", requestObject.getMingcheng());
        return "success";
    }
}
