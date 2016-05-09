package com.jj.controller;

import com.alibaba.fastjson.JSON;
import com.jj.pojo.ZhuanyeSettingRequest;
import com.jj.request.BanjiSettingRequest;
import com.jj.request.XueyuanSettingRequest;
import com.jj.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by yewangwang on 2016/5/8.
 */
@Controller
@RequestMapping("/setting")
public class SystemSettingController {
    @Autowired
    private XueyuanSettingService xueYuanSettingService;
    @Autowired
    private ZhuanyeSettingService zhuanyeSettingService;
    @Autowired
    private BanjiSettingService banjiSettingService;
    @Autowired
    private GetXueyuanListService getXueyuanListService;
    @Autowired
    private GetZhuanyeListService getZhuanyeListService;
    @Autowired
    private GetBanjiListService banjiListService;

    @RequestMapping("/xueyuan/setting.do")
    public String xueyuansetting(XueyuanSettingRequest requestObject, HttpServletRequest request) {
        xueYuanSettingService.add(requestObject, request);
        return "jsp/xueyuansetting";
    }


    @RequestMapping("/xueyuan/get/list.do")
    @ResponseBody
    public String xueyuanGetList(HttpServletRequest request, HttpServletResponse response) {

        return getXueyuanListService.getList(request);
    }

    @RequestMapping("/zhuanye/setting.do")
    public String zhuanyesetting(ZhuanyeSettingRequest requestObject, HttpServletRequest request) {
        zhuanyeSettingService.add(requestObject, request);
        return "jsp/zhuanyesetting";
    }

    @RequestMapping("/zhuanye/get/list.do")
    @ResponseBody
    public String zhuanyeGetList(HttpServletRequest request, HttpServletResponse response) {
        return getZhuanyeListService.getList(request);
    }

    @RequestMapping("/banji/setting.do")
    public String banjisetting(BanjiSettingRequest requestObject, HttpServletRequest request) {
        banjiSettingService.add(requestObject, request);
        return "jsp/banjisetting";
    }

    @RequestMapping("/banji/get/list.do")
    @ResponseBody
    public String banjiGetList(HttpServletRequest request, HttpServletResponse response) {
        return banjiListService.getList(request);
    }
}
