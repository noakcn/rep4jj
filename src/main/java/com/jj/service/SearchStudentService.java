package com.jj.service;

import com.jj.dao.IXueshengDao;
import com.jj.pojo.XueSheng;
import com.jj.request.SearchRequest;
import com.jj.response.XueShengResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yewangwang on 2016/5/12.
 */
@Service
public class SearchStudentService {
    @Autowired
    private IXueshengDao xueshengDao;

    public void searchStudent(SearchRequest requestObject, HttpServletRequest request) {
        List<XueSheng> xueShengList = xueshengDao.findAllByConditon(requestObject.getBanjiId(),
                requestObject.getXingming());
        List<XueShengResponse> xueShengResponseList=new ArrayList<XueShengResponse>();
        for(XueSheng xs:xueShengList){
            XueShengResponse xsResponse=new XueShengResponse(xs);
            xueShengResponseList.add(xsResponse);
        }
        request.setAttribute("xueshengList",xueShengResponseList);

    }

}
