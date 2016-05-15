package com.jj.controller;

import com.jj.request.GetChengjiRequest;
import com.jj.request.GetKechengListRequest;
import com.jj.request.SearchRequest;
import com.jj.request.UpdateStudentRequest;
import com.jj.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yewangwang on 2016/5/11.
 */
@Controller
@RequestMapping("/search")
public class SearchController {
    @Autowired
    private SearchStudentService searchStudentService;
    @Autowired
    private DeleteStudentService deleteStudentService;
    @Autowired
    private UpdateStudentService updateStudentService;
    @Autowired
    private ToUpdateStudentService toUpdateStudentService;
    @Autowired
    private SearchKechengService searchKechengService;
    @Autowired
    private GetChengjiService getChengjiService;
    @Autowired
    private FindTeacherService findTeacherService;

    @RequestMapping("/find/student")
    public String searchStudent(SearchRequest requestObject, HttpServletRequest request) {
        searchStudentService.searchStudent(requestObject, request);
        return "jsp/searchstudent";
    }

    @RequestMapping("/find/teacher")
    public String searchTeacher(SearchRequest requestObject, HttpServletRequest request) {
        findTeacherService.find(requestObject,request);
        return "jsp/searchteacher";
    }


    @RequestMapping("/delete/student")
    public String deleteStudent(HttpServletRequest request) {
        deleteStudentService.delete(request);

        return "jsp/searchstudent";
    }


    @RequestMapping("/to/update/student")
    public String toUpdateStudent(HttpServletRequest request) {
        toUpdateStudentService.findOneStudnet(request);
        return "jsp/updatestudent";
    }

    @RequestMapping("/update/student")
    public String updateStudent(UpdateStudentRequest requestObject, HttpServletRequest request) {
        updateStudentService.update(requestObject, request);

        return "jsp/searchstudent";
    }

    @RequestMapping("/get/kecheng/list")
    public String getKechengList(GetKechengListRequest requestObject, HttpServletRequest request) {
        searchKechengService.findAll(requestObject, request);
        return "jsp/kechengsearch";
    }

    @RequestMapping("/get/chengji")
    public String getChengjie(GetChengjiRequest requestObject, HttpServletRequest request) {
        getChengjiService.get(requestObject, request);
        return "jsp/searchchengji";
    }
}
