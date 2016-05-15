package com.jj.service;

import com.jj.dao.IChengjiDao;
import com.jj.pojo.Chengji;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yewangwang on 2016/5/15.
 */
@Service
public class InputChengjiService {
    @Autowired
    private IChengjiDao chengjiDao;

    public String save(HttpServletRequest request){

        Chengji chengji=new Chengji();
        chengji.setKechengId(request.getParameter("kechengId"));
        chengji.setXueshengId(request.getParameter("xueshengId"));
        chengji.setChengji(Double.parseDouble(request.getParameter("chengji")));
        Chengji chengji2=chengjiDao.findOne(chengji.getKechengId(),chengji.getXueshengId());
        if(chengji2!=null){
            return "请勿重复录入";
        }
        chengjiDao.save(chengji);
        return "录入成功";
    }

}
