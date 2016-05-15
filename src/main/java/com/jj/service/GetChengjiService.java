package com.jj.service;

import com.jj.dao.IChengjiDao;
import com.jj.pojo.Kecheng;
import com.jj.pojo.XueSheng;
import com.jj.request.GetChengjiRequest;
import com.jj.response.KechengResponse;
import com.jj.response.XueShengResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * Created by yewangwang on 2016/5/15.
 */
@Service
public class GetChengjiService {
    @Autowired
    private IChengjiDao chengjiDao;

    public void get(GetChengjiRequest requestObject, HttpServletRequest request){
        String xueshengId= (String) request.getSession().getAttribute("id");
        String kechengId=requestObject.getKechengId();
        String kechengmingcheng=requestObject.getKechengmingcheng();
        XueSheng xuesheng =chengjiDao.findChengji(kechengId,xueshengId,kechengmingcheng);
        if(xuesheng==null)return ;
        XueShengResponse xueShengResponse=new XueShengResponse(xuesheng);
        xueShengResponse.setKechengs(new ArrayList<KechengResponse>());
        for(Kecheng k:xuesheng.getKechengs()){
            KechengResponse r=new KechengResponse(k);
            r.setChengji(k.getChengji());
            xueShengResponse.getKechengs().add(r);
        }

        request.setAttribute("xuesheng",xueShengResponse);
    }

}
