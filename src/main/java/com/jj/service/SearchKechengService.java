package com.jj.service;

import com.jj.controller.SystemSettingController;
import com.jj.dao.IKechengDao;
import com.jj.pojo.Kecheng;
import com.jj.request.GetKechengListRequest;
import com.jj.request.KechengResponse;
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

    public void findAll(GetKechengListRequest requestObject, HttpServletRequest request){
        System.out.println(requestObject);
        List<Kecheng> kechengs=kechengDao.findAll(requestObject.getXueyuanId(),
                requestObject.getMingcheng(),null);
        List<KechengResponse> kechengResponses=new ArrayList<KechengResponse>();
        for(Kecheng k:kechengs){
            KechengResponse r=new KechengResponse(k);
            kechengResponses.add(r);
        }
        request.setAttribute("kechengList",kechengResponses);

    }
}
