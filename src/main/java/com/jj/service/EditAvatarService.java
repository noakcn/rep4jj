package com.jj.service;

import com.jj.dao.IUserDao;
import com.jj.pojo.User;
import com.jj.request.EditAvatarRequest;
import com.jj.utils.UUIDUtils;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by yewangwang on 2016/5/15.
 */
@Service
public class EditAvatarService {
    @Autowired
    private IUserDao userDao;
    @Autowired
    private GetProfileInfoService getProfileInfoService;


    public void edit(EditAvatarRequest requestObject, HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        String fileName = UUIDUtils.generateFileName();
        CommonsMultipartFile img = requestObject.getImg();
        img.getName();
        if (img == null) return;
        String originalFilename = img.getOriginalFilename();
        String suffix = originalFilename.substring(originalFilename.indexOf("."), originalFilename.length());
        FileOutputStream fileOut = null;
        FileOutputStream fileOut2 = null;
        try {
            String newFilename = fileName + suffix;
            fileOut = new FileOutputStream(new File("E:/jjproject/src/main/webapp/pic/" + newFilename));
            fileOut2 = new FileOutputStream(new File("E:/jjproject/target/jiaowu/pic/" + newFilename));
            FileCopyUtils.copy(img.getInputStream(), fileOut);
            FileCopyUtils.copy(img.getInputStream(), fileOut2);
            userDao.updateHeadImg(newFilename, user.getId());
            user.setHeadImg("../pic/" + newFilename);
            getProfileInfoService.findOne(request);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileOut != null)
                    fileOut.close();
                if (fileOut2 != null)
                    fileOut2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
