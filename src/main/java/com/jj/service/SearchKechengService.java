package com.jj.service;

import com.jj.dao.IKechengDao;
import com.jj.dao.IXuankeDao;
import com.jj.pojo.Kecheng;
import com.jj.pojo.Xuanke;
import com.jj.request.GetKechengListRequest;
import com.jj.response.KechengResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yewangwang on 2016/5/14.
 */
@Service
public class SearchKechengService {
    @Autowired
    private IKechengDao kechengDao;
    @Autowired
    private IXuankeDao xuankeDao;

    public void findAll(GetKechengListRequest requestObject, HttpServletRequest request) {

        List<Kecheng> kechengs = kechengDao.findAll(requestObject.getXueyuanId(),
                requestObject.getKechengmingcheng(), null);
        List<KechengResponse> kechengResponses = new ArrayList<KechengResponse>();
        for (Kecheng k : kechengs) {
            KechengResponse r = new KechengResponse(k);
            kechengResponses.add(r);
            Xuanke xuanke = xuankeDao.findOne(
                    (String) request.getSession().getAttribute("id"),
                    k.getId()
            );
            if (xuanke != null) {
                r.setStatus("已选");
            } else {
                r.setStatus("未选");
            }
        }
        request.setAttribute("kechengList", kechengResponses);

    }

    public String findCourseList(GetKechengListRequest requestObject, HttpServletRequest request) {
        List<Kecheng> kechengs = kechengDao.findAll(requestObject.getXueyuanId(),
                requestObject.getKechengmingcheng(), null);
        StringBuilder options = new StringBuilder();
        options.append("<option value=''>请选择课程</option>");
        for (Kecheng k : kechengs) {
            options.append("<option value='" + k.getId() + "'>");
            options.append(k.getKechengmingcheng());
            options.append("</option>");
        }
        return options.toString();
    }
}
