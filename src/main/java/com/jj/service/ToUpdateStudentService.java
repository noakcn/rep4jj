package com.jj.service;

import com.jj.dao.IXueshengDao;
import com.jj.pojo.XueSheng;
import com.jj.response.XueShengResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yewangwang on 2016/5/14.
 */
@Service
public class ToUpdateStudentService {
    @Autowired
    private IXueshengDao xueshengDao;

    public void findOneStudnet(HttpServletRequest request){
        String id=request.getParameter("id");
        if(StringUtils.isEmpty(id))return;
        XueSheng xueSheng=xueshengDao.findOne(id);
        XueShengResponse xueShengResponse=new XueShengResponse(xueSheng);
        request.setAttribute("xuesheng",xueShengResponse);
    }
}
