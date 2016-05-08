package com.jj.service;

import com.jj.dao.IZhuanyeDao;
import com.jj.pojo.Zhuanye;
import com.jj.pojo.ZhuanyeSettingRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yewangwang on 2016/5/8.
 */
@Service
public class ZhuanyeSettingService {

    @Autowired
    private IZhuanyeDao zhuanyeDao;

    public void add(ZhuanyeSettingRequest requestObject, HttpServletRequest request) {
        if(StringUtils.isEmpty(requestObject.getXueyuanId())){
            request.setAttribute("result", "fail");
            request.setAttribute("msg","请选择一个学院");
            return ;
        }
        if(StringUtils.isEmpty(requestObject.getMingcheng())) {
            request.setAttribute("result", "fail");
            request.setAttribute("msg", "名称为空");
            return;
        }
        Zhuanye zhuanye=new Zhuanye(requestObject);
        zhuanyeDao.save(zhuanye);
        request.setAttribute("result", "success");
        request.setAttribute("msg","添加成功");
        request.setAttribute("mingcheng",requestObject.getMingcheng());
    }
}
