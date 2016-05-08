package com.jj.dao;

import com.jj.pojo.Xueyuan;

import java.util.List;

/**
 * Created by yewangwang on 2016/5/8.
 */
public interface IXueyuanDao {
    int save(Xueyuan xueyuan);

    List<Xueyuan> findAll();


}
