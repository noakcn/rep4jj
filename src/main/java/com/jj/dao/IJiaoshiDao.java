package com.jj.dao;

import com.jj.pojo.Jiaoshi;

import java.util.List;

/**
 * Created by yewangwang on 2016/5/5.
 */
public interface IJiaoshiDao {

    Jiaoshi findOne(String userId);
    List<Jiaoshi> findAllByName(String xingming);

    int save(Jiaoshi jiaoshi);

    List<Jiaoshi> findAll();

}
