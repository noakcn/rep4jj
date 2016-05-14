package com.jj.service;

import com.jj.dao.IUserDao;
import com.jj.dao.IXueshengDao;
import com.jj.utils.Containts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yewangwang on 2016/5/14.
 */
@Service
public class DeleteStudentService {
    @Autowired
    private IXueshengDao xueshengDao;
    @Autowired
    private IUserDao userDao;

    public void delete(HttpServletRequest request) {
        String id = request.getParameter("id");
        if(StringUtils.isEmpty(id)){
            request.setAttribute(Containts.RESULT, Containts.FAIL);
            request.setAttribute(Containts.MSG, "删除成功");
            return;
        }
        xueshengDao.delete(id);
        userDao.delete(id);
        request.setAttribute("result", "success");
        request.setAttribute("msg", "删除成功");
    }
}
