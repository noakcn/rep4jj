package com.jj.controller;

import com.jj.dao.IJiaoshiDao;
import com.jj.dao.IUserDao;
import com.jj.dao.IXueshengDao;
import com.jj.pojo.Jiaoshi;
import com.jj.pojo.User;
import com.jj.pojo.XueSheng;
import com.jj.pojo.enumclass.Role;
import com.jj.request.LoginRequest;
import com.jj.utils.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by yewangwang on 2016/5/5.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserDao userDao;
    @Autowired
    private IJiaoshiDao jiaoshiDao;
    @Autowired
    private IXueshengDao xueshengDao;

    @RequestMapping("/login")
    public
    @ResponseBody
    String doLogin(LoginRequest loginRequest, HttpServletRequest request, HttpServletResponse response) {

        User loginINfo = new User();
        loginINfo.setUsername(loginRequest.getUsername());
        User user = userDao.findOne(loginINfo);
        String out = "";
        if (user == null) {
            out = "用户不存在";
        } else if (user.getPassword().equals(loginRequest.getPassword())) {

            switch (user.getRole()) {
                case ADMIN:
                    Jiaoshi jiaoshi = jiaoshiDao.findOne(user.getId());
                    request.getSession().setAttribute("username", jiaoshi.getXingming());
                    request.getSession().setAttribute("role", Role.ADMIN.toString());
                    request.getSession().setAttribute("roleStr", Role.ADMIN.getContent());
                    break;
                case TEACHER:
                    jiaoshi = jiaoshiDao.findOne(user.getId());
                    request.getSession().setAttribute("username", jiaoshi.getXingming());
                    request.getSession().setAttribute("role", Role.TEACHER.toString());
                    request.getSession().setAttribute("roleStr", Role.TEACHER.getContent());
                    break;
                case STUDENT:
                    XueSheng xueSheng = xueshengDao.findOne(user.getId());
                    request.getSession().setAttribute("username", xueSheng.getXingming());
                    request.getSession().setAttribute("role", Role.STUDENT.toString());
                    request.getSession().setAttribute("roleStr", Role.STUDENT.getContent());
                    break;
            }
            out = "success";
        } else {
            out = "密码错误";
        }

        return out;
    }

    @RequestMapping("/to/index")
    public String toIndex(HttpServletRequest request, HttpServletResponse response) {

        return "jsp/index";
    }
}
