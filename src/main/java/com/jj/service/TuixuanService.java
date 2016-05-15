package com.jj.service;

import com.jj.dao.IXuankeDao;
import com.jj.pojo.Xuanke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yewangwang on 2016/5/14.
 */
@Service
public class TuixuanService {

    @Autowired
    private IXuankeDao xuankeDao;

    public String tuixuan(HttpServletRequest request){
        String xueshengId = (String) request.getSession().getAttribute("id");
        String kechengId = request.getParameter("id");
        Xuanke xuanke=xuankeDao.findOne(xueshengId,kechengId);
        if(xuanke==null)return "您没有改课的报名记录,无需退选";
        xuankeDao.delete(xueshengId,kechengId);

        return "退选成功";
    }
}
