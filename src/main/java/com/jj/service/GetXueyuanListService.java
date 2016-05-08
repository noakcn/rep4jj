package com.jj.service;

import com.jj.dao.IXueyuanDao;
import com.jj.pojo.Xueyuan;
import com.jj.request.XueyuanSettingRequest;
import com.jj.response.XueyuanResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yewangwang on 2016/5/8.
 */
@Service
public class GetXueyuanListService {

    @Autowired
    private IXueyuanDao xueyuanDao;

    public String getList(HttpServletRequest request) {
        List<Xueyuan> xueyuanList = xueyuanDao.findAll();
        StringBuilder sb = new StringBuilder();
        for (Xueyuan t : xueyuanList) {
            sb.append("<option value='"+t.getId()+"'>"+t.getMingcheng()+"</option>");
        }

        return sb.toString();
    }


}
