package com.jj.controller;

import com.jj.request.ImportStudentRequest;
import com.jj.service.ImportStudentService;
import com.jj.service.ImportTeacherService;
import com.jj.utils.ExcelReader;
import org.aspectj.lang.annotation.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by yewangwang on 2016/5/8.
 */
@Controller
@RequestMapping("/info")
public class InfoInputController {

    @Autowired
    private ImportStudentService importStudentService;
    @Autowired
    private ImportTeacherService importTeacherService;


    @RequestMapping("/import/students")
    public String importStudents(ImportStudentRequest requestObject, HttpServletRequest request) {
        if (!importStudentService.importStudent(requestObject, request)) {
            request.setAttribute("result", "fail");
            request.setAttribute("msg", "导入失败");
        }
        return "jsp/instudent";
    }

    @RequestMapping("/import/teachers")
    public String importTeachers(ImportStudentRequest requestObject, HttpServletRequest request) {
        if (!importTeacherService.importTeacher(requestObject, request)) {
            request.setAttribute("result", "fail");
            request.setAttribute("msg", "导入失败");
        }
        return "jsp/inteacher";
    }

}
