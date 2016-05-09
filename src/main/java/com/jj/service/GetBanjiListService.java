package com.jj.service;

import com.jj.dao.IBanjiDao;
import com.jj.dao.IZhuanyeDao;
import com.jj.pojo.Banji;
import com.jj.pojo.Zhuanye;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by yewangwang on 2016/5/8.
 */
@Service
public class GetBanjiListService {

    @Autowired
    private IBanjiDao banjiDao;

    public String getList(HttpServletRequest request) {
        List<Banji> banjiList = banjiDao.findAll(request.getParameter("id"));
        StringBuilder sb = new StringBuilder();
        for (Banji t : banjiList) {
            sb.append("<option value='"+t.getId()+"'>"+t.getMingcheng()+"</option>");
        }
        return sb.toString();
    }


}
