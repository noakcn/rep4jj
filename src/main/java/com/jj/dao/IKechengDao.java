package com.jj.dao;

import com.jj.pojo.Kecheng;
import com.jj.pojo.enumclass.KechengType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by yewangwang on 2016/5/14.
 */
public interface IKechengDao {
    int save(Kecheng kecheng);

    int findOne(String id);

    List<Kecheng> findAll(@Param("xueyuanId") String xueyuanId,
                          @Param("mingcheng")String mingcheng,
                          @Param("type")KechengType type);

    int delete(String id);
}
