package com.jj.service;

import com.jj.dao.IXueyuanDao;
import com.jj.dao.IZhuanyeDao;
import com.jj.pojo.Xueyuan;
import com.jj.pojo.Zhuanye;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by yewangwang on 2016/5/8.
 */
@Service
public class GetZhuanyeListService {

    @Autowired
    private IZhuanyeDao zhuanyeDao;

    public String getList(HttpServletRequest request) {
        List<Zhuanye> zhuanyeList = zhuanyeDao.findAll(request.getParameter("id"));
        StringBuilder sb = new StringBuilder();
        for (Zhuanye t : zhuanyeList) {
            sb.append("<option value='"+t.getId()+"'>"+t.getMingcheng()+"</option>");
        }
        return sb.toString();
    }


}
