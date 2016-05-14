package com.jj.service;

import com.jj.dao.IJiaoshiDao;
import com.jj.dao.IUserDao;
import com.jj.dao.IXueshengDao;
import com.jj.pojo.Jiaoshi;
import com.jj.pojo.User;
import com.jj.pojo.XueSheng;
import com.jj.pojo.enumclass.Role;
import com.jj.pojo.enumclass.Sex;
import com.jj.request.ImportStudentRequest;
import com.jj.response.JiaoshiResponse;
import com.jj.response.XueShengResponse;
import com.jj.utils.ExcelReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by yewangwang on 2016/5/9.
 */
@Service
public class ImportTeacherService {
    @Autowired
    private ExcelReader excelReader;
    @Autowired
    private IUserDao userDao;
    @Autowired
    private IJiaoshiDao jiaoshiDao;

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public boolean importTeacher(ImportStudentRequest requestObject, HttpServletRequest request) {
        int count = 0;
        List<Jiaoshi> jiaoshis = new ArrayList<Jiaoshi>();
        try {
            List<Map<Integer, String>> sheetList = excelReader.readExcelContent(requestObject.getFile().getInputStream());
            if (sheetList != null) {
                for (Map<Integer, String> row : sheetList) {

                    User user = new User();
                    user.setUsername(row.get(1));
                    user.setPassword("123456");
                    user.setRole(Role.TEACHER);
                    user.setEmail(row.get(5));
                    User t = userDao.findOne(user);
                    if (t != null) continue;
                    userDao.save(user);
                    Jiaoshi jiaoshi = new Jiaoshi();
                    jiaoshi.setUserId(user.getId());
                    jiaoshi.setGonghao(user.getUsername());
                    jiaoshi.setXingming(row.get(2));
                    if (row.get(3).equals("男")) {
                        jiaoshi.setXingbie(Sex.MAN);
                    } else if (row.get(3).equals("女")) {
                        jiaoshi.setXingbie(Sex.FEMALE);
                    } else {
                        jiaoshi.setXingbie(Sex.UNKNOW);
                    }
                    jiaoshi.setJobDate(sdf.parse(row.get(4)));

                    jiaoshiDao.save(jiaoshi);
                    count++;
                    jiaoshis.add(jiaoshi);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        request.setAttribute("result", "success");
        request.setAttribute("msg", "导入成功" + count + "条");


        List<JiaoshiResponse> jiaoshiResponses = new ArrayList<JiaoshiResponse>();
        for (Jiaoshi j : jiaoshis) {
            JiaoshiResponse jr = new JiaoshiResponse(j);
            jiaoshiResponses.add(jr);
        }
        request.setAttribute("jiaoshiList", jiaoshiResponses);
        return true;
    }
}
