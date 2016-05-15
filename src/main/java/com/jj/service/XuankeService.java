package com.jj.service;

import com.jj.dao.IXuankeDao;
import com.jj.pojo.User;
import com.jj.pojo.Xuanke;
import com.jj.utils.Containts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yewangwang on 2016/5/14.
 */
@Service
public class XuankeService {

    @Autowired
    private IXuankeDao xuankeDao;

    public String xuanke(HttpServletRequest request) {
        String xueshengId = (String) request.getSession().getAttribute("id");
        String kechengId = request.getParameter("id");
        Xuanke xuanke=xuankeDao.findOne(xueshengId,kechengId);
        if(xuanke!=null)return "该课已选,请选别的课";
        xuanke = new Xuanke();
        xuanke.setKechengId(kechengId);
        xuanke.setXueshengId(xueshengId);

        xuankeDao.save(xuanke);
        return "选课成功";
    }
}
