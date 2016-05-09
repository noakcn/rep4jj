package com.jj.service;

import com.jj.dao.IUserDao;
import com.jj.dao.IXueshengDao;
import com.jj.pojo.User;
import com.jj.pojo.XueSheng;
import com.jj.pojo.enumclass.Enable;
import com.jj.pojo.enumclass.Role;
import com.jj.pojo.enumclass.Sex;
import com.jj.request.ImportStudentRequest;
import com.jj.utils.ExcelReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by yewangwang on 2016/5/9.
 */
@Service
public class ImportStudentService {
    @Autowired
    private ExcelReader excelReader;
    @Autowired
    private IUserDao userDao;
    @Autowired
    private IXueshengDao xueshengDao;

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public boolean importStudent(ImportStudentRequest requestObject, HttpServletRequest request) {

        try {
            List<Map<Integer, String>> sheetList = excelReader.readExcelContent(requestObject.getFile().getInputStream());
            if (sheetList != null) {
                for (Map<Integer, String> row : sheetList) {

                    User user = new User();
                    user.setUsername(row.get(1));
                    user.setPassword("123456");
                    user.setRole(Role.STUDENT);
                    user.setEmail(row.get(14));
                    User t = userDao.findOne(user);
                    if (t != null) continue;
                    userDao.save(user);
                    XueSheng xueSheng = new XueSheng();
                    xueSheng.setUserId(user.getId());
                    xueSheng.setXuehao(user.getUsername());
                    xueSheng.setXingming(row.get(2));
                    if (row.get(3).equals("男")) {
                        xueSheng.setXingbie(Sex.MAN);
                    } else if (row.get(3).equals("女")) {
                        xueSheng.setXingbie(Sex.FEMALE);
                    } else {
                        xueSheng.setXingbie(Sex.UNKNOW);
                    }
                    xueSheng.setRuxueDate(sdf.parse(row.get(21)));
                    xueSheng.setBanjiId(requestObject.getBanjiId());
                    xueshengDao.save(xueSheng);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        request.setAttribute("result","success");
        request.setAttribute("msg","导入成功");
        return true;
    }
}
