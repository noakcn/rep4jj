package com.jj.controller;

import com.jj.request.EditAvatarRequest;
import com.jj.service.EditAvatarService;
import com.jj.service.GetProfileInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yewangwang on 2016/5/14.
 */
@Controller
@RequestMapping("/profile")
public class ProfileController {
    @Autowired
    private GetProfileInfoService getProfileInfoService;
    @Autowired
    private EditAvatarService editAvatarService;

    @RequestMapping("/to/page")
    public String toProfile(HttpServletRequest request) {
        getProfileInfoService.findOne(request);
        return "jsp/profile";
    }

    @RequestMapping("/edit/avatar")
    public String editAvatar(EditAvatarRequest requestObject,HttpServletRequest request){
        editAvatarService.edit(requestObject,request);
        return "jsp/profile";
    }
}
