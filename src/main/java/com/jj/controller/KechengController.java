package com.jj.controller;

import com.jj.request.GetKechengListRequest;
import com.jj.request.SearchRequest;
import com.jj.request.XuankeRequest;
import com.jj.service.FindOneCourseService;
import com.jj.service.SearchKechengService;
import com.jj.service.TuixuanService;
import com.jj.service.XuankeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yewangwang on 2016/5/14.
 */
@Controller
@RequestMapping("/course")
public class KechengController {
    @Autowired
    private SearchKechengService searchKechengService;
    @Autowired
    private XuankeService xuankeService;
    @Autowired
    private TuixuanService tuixuanService;
    @Autowired
    private FindOneCourseService findOneCourseService;

    @RequestMapping("/do/xuanke")
    @ResponseBody
    public String xuanke(HttpServletRequest request) {
        return xuankeService.xuanke(request);
    }

    @RequestMapping("/do/tuixuan")
    @ResponseBody
    public String tuixuan(HttpServletRequest request) {
        return tuixuanService.tuixuan(request);
    }

    @RequestMapping("/get/kecheng/list")
    public String getKechengList(GetKechengListRequest requestObject, HttpServletRequest request) {
        searchKechengService.findAll(requestObject, request);
        return "jsp/xuanke";
    }

    @RequestMapping("/find/one/kecheng")
    public String searchStudent(SearchRequest requestObject, HttpServletRequest request) {
        findOneCourseService.findOne(requestObject, request);
        return "jsp/inchengji";
    }


}
