package com.jj.dao;

import com.jj.pojo.Zhuanye;

import java.util.List;

/**
 * Created by yewangwang on 2016/5/8.
 */
public interface IZhuanyeDao {
    int save(Zhuanye zhuanye);

    List<Zhuanye> findAll(String xueyuanId);
}
