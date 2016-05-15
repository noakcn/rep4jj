package com.jj.service;

import com.jj.dao.IJiaoshiDao;
import com.jj.pojo.Jiaoshi;
import com.jj.request.SearchRequest;
import com.jj.response.JiaoshiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yewangwang on 2016/5/15.
 */
@Service
public class FindTeacherService {
    @Autowired
    private IJiaoshiDao jiaoshiDao;

    public void find(SearchRequest requestObject, HttpServletRequest request) {
        List<Jiaoshi> jiaoshis = null;
        if (StringUtils.isEmpty(requestObject.getXingming())) {
            jiaoshis = jiaoshiDao.findAll();
        } else {
            jiaoshis = jiaoshiDao.findAllByName(requestObject.getXingming());
        }
        List<JiaoshiResponse> rlist = new ArrayList<JiaoshiResponse>();
        for (Jiaoshi j : jiaoshis) {
            JiaoshiResponse r = new JiaoshiResponse(j);
            rlist.add(r);
        }
        request.setAttribute("teachers", rlist);
    }
}
