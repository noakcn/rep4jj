package com.jj.dao;

import com.jj.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by yewangwang on 2016/5/4.
 */
public interface IUserDao {
    User findOne(User user);

    int save(User user);

    int delete(String id);

    int updateHeadImg(@Param("filename") String filename,
                      @Param("id")String id);
}
