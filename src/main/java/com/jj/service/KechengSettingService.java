package com.jj.service;

import com.jj.dao.IKechengDao;
import com.jj.pojo.Kecheng;
import com.jj.pojo.enumclass.KechengType;
import com.jj.request.KechengSettingRequest;
import com.jj.utils.Containts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yewangwang on 2016/5/14.
 */
@Service
public class KechengSettingService {
    @Autowired
    private IKechengDao kechengDao;

    public void save(KechengSettingRequest requestObject, HttpServletRequest request) {
        Kecheng kecheng = new Kecheng();
        kecheng.setKechengmingcheng(requestObject.getKechengmingcheng());
        kecheng.setType(KechengType.findByCode(requestObject.getType()));
        kecheng.setXuefeng(requestObject.getXuefeng());
        kecheng.setXueyuanId(requestObject.getXueyuanId());
        kecheng.setZongkeshi(requestObject.getZongkeshi());

        kechengDao.save(kecheng);
        request.setAttribute(Containts.RESULT,Containts.SUCCESS);
        request.setAttribute(Containts.MSG,"课程"+kecheng.getKechengmingcheng()+"添加成功");
    }
}
