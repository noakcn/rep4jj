package com.jj.service;

import com.jj.dao.IBanjiDao;
import com.jj.pojo.Banji;
import com.jj.pojo.ZhuanyeSettingRequest;
import com.jj.request.BanjiSettingRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yewangwang on 2016/5/8.
 */
@Service
public class BanjiSettingService {
    @Autowired
    private IBanjiDao banjiDao;

    public void add(BanjiSettingRequest requestObject, HttpServletRequest request) {
        if(StringUtils.isEmpty(requestObject.getXueyuanId())){
            request.setAttribute("result","fail");
            request.setAttribute("msg","请选择学院");
            return ;
        }
        if(StringUtils.isEmpty(requestObject.getZhuanyeId())){
            request.setAttribute("result","fail");
            request.setAttribute("msg","请选择专业");
            return ;
        }
        if(requestObject.getNianji()==null){
            request.setAttribute("result","fail");
            request.setAttribute("msg","请选择年级");
            return ;
        }
        if(StringUtils.isEmpty(requestObject.getMingcheng())){
            request.setAttribute("result","fail");
            request.setAttribute("msg","名称为空");
            return ;
        }
        Banji banji=new Banji();
        banji.setZhuanyeId(requestObject.getZhuanyeId());
        banji.setMingcheng(requestObject.getMingcheng());
        banji.setNianji(requestObject.getNianji());
        Banji isExist=banjiDao.findOne(banji);
        if(isExist!=null){
            request.setAttribute("result","fail");
            request.setAttribute("msg","班级已存在");
            return ;
        }

        banjiDao.save(banji);
        request.setAttribute("result","success");
        request.setAttribute("msg","添加成功");
        request.setAttribute("mingcheng",banji.getMingcheng());

    }
}
