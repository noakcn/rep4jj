package com.jj.service;

import com.jj.dao.IJiaoshiDao;
import com.jj.dao.IXueshengDao;
import com.jj.pojo.Jiaoshi;
import com.jj.pojo.XueSheng;
import com.jj.pojo.enumclass.Role;
import com.jj.response.XueShengResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * 获取个人资料
 * Created by yewangwang on 2016/5/15.
 */
@Service
public class GetProfileInfoService {

    @Autowired
    private IJiaoshiDao jiaoshiDao;
    @Autowired
    private IXueshengDao xueshengDao;


    public void findOne(HttpServletRequest request) {
        Role role = Role.valueOf((String) request.getSession().getAttribute("role"));
        String id = (String) request.getSession().getAttribute("id");
        if (role.equals(Role.ADMIN)
                || role.equals(Role.TEACHER)) {
            Jiaoshi jiaoshi = jiaoshiDao.findOne(id);
            request.setAttribute("proinfo", jiaoshi);
        } else {
            XueSheng xueSheng = xueshengDao.findOne(id);
            XueShengResponse xueShengResponse = new XueShengResponse(xueSheng);
            request.setAttribute("proinfo", xueShengResponse);
            List<XueSheng> schoolmate = xueshengDao.findAll(xueSheng.getBanjiId());
            List<XueShengResponse> schoolmateResponse = new ArrayList<XueShengResponse>();
            for (XueSheng x : schoolmate) {
                if (x.getUserId().equals(id)) continue;
                XueShengResponse r=new XueShengResponse(x);
                schoolmateResponse.add(r);
            }
            request.setAttribute("schoolmate",schoolmateResponse);
        }
    }
}
