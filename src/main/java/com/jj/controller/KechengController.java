package com.jj.controller;

import com.jj.request.GetKechengListRequest;
import com.jj.request.SearchRequest;
import com.jj.request.XuankeRequest;
import com.jj.service.*;
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
    @Autowired
    private InputChengjiService inputChengjiService;

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

    @RequestMapping("/get/kecheng/list/ajax")
    @ResponseBody
    public String getKechengListAjax(GetKechengListRequest requestObject, HttpServletRequest request) {
        return searchKechengService.findCourseList(requestObject, request);
    }

    @RequestMapping("/find/one/kecheng")
    public String searchStudent(SearchRequest requestObject, HttpServletRequest request) {
        findOneCourseService.findOne(requestObject, request);
        return "jsp/inchengji";
    }

    @RequestMapping("/input/chengji")
    @ResponseBody
    public String inputChengji(HttpServletRequest request){
        return inputChengjiService.save(request);
    }


}
