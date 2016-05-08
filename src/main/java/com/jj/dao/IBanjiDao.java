package com.jj.dao;

import com.jj.pojo.Banji;

import java.util.List;

/**
 * Created by yewangwang on 2016/5/8.
 */
public interface IBanjiDao {
    int save(Banji banji);

    List<Banji> findAll(String zhuanyeId);

    Banji findOne(Banji banji);
}
