package com.jj.dao;

import com.jj.pojo.Xuanke;
import org.apache.ibatis.annotations.Param;

/**
 * Created by yewangwang on 2016/5/14.
 */
public interface IXuankeDao {
    int save(Xuanke xuanke);
    Xuanke findOne(@Param("xueshengId")String xueshengId,
                @Param("kechengId")String kechengId);
    int delete(@Param("xueshengId")String xueshengId,
                @Param("kechengId")String kechengId);

}
