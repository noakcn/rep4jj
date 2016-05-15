package com.jj.dao;

import com.jj.pojo.Chengji;
import com.jj.pojo.XueSheng;
import org.apache.ibatis.annotations.Param;

/**
 * Created by yewangwang on 2016/5/14.
 */
public interface IChengjiDao {
    int save(Chengji chengji);
    Chengji findOne(@Param("kechengId")String kechengId,
                    @Param("xueshengId")String xueshengId
                    );
    XueSheng findChengji(@Param("kechengId")String kechengId,
                         @Param("xueshengId")String xueshengId,
                         @Param("kechengmingcheng")String kechengmingcheng);
}
