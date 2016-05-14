package com.jj.dao;

import com.jj.pojo.User;

/**
 * Created by yewangwang on 2016/5/4.
 */
public interface IUserDao {
    User findOne(User user);

    int save(User user);

    int delete(String id);
}
