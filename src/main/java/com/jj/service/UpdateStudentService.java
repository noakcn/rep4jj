package com.jj.service;

import com.jj.dao.IXueshengDao;
import com.jj.pojo.XueSheng;
import com.jj.pojo.enumclass.Sex;
import com.jj.request.UpdateStudentRequest;
import com.jj.utils.Containts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yewangwang on 2016/5/14.
 */
@Service
public class UpdateStudentService {
    @Autowired
    private IXueshengDao xueshengDao;

    public void update(UpdateStudentRequest requestObject, HttpServletRequest request){
        String id=requestObject.getUserId();
        if(StringUtils.isEmpty(id)){
            request.setAttribute(Containts.RESULT, Containts.FAIL);
            request.setAttribute(Containts.MSG, "编辑失败");
            return;
        }
        XueSheng xueSheng=xueshengDao.findOne(id);
        xueSheng.setXingming(requestObject.getXingming());
        xueSheng.setXingbie(Sex.findByCode(requestObject.getXingbie()));

        xueshengDao.update(xueSheng);
        request.setAttribute(Containts.RESULT, Containts.SUCCESS);
        request.setAttribute(Containts.MSG, "编辑成功");


    }
}
