package com.jj.service;

import com.jj.dao.IKechengDao;
import com.jj.pojo.Kecheng;
import com.jj.pojo.XueSheng;
import com.jj.response.KechengResponse;
import com.jj.request.SearchRequest;
import com.jj.response.XueShengResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * Created by yewangwang on 2016/5/15.
 */
@Service
public class FindOneCourseService {
    @Autowired
    private IKechengDao kechengDao;

    public void findOne(SearchRequest requestObject, HttpServletRequest request) {
        Kecheng kecheng = kechengDao.findOne(requestObject.getBanjiId(), requestObject.getKechengId());
        if (kecheng != null) {
            KechengResponse kr = new KechengResponse(kecheng);
            kr.setXueShengs(new ArrayList<XueShengResponse>());
            for (XueSheng x : kecheng.getXueShengs()) {
                XueShengResponse xsr = new XueShengResponse(x);
                xsr.setChengji(x.getChengji());
                kr.getXueShengs().add(xsr);
            }
            request.setAttribute("kecheng", kr);

        }
    }
}
