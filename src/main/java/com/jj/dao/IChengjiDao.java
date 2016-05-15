package com.jj.dao;

import com.jj.pojo.Chengji;
import org.apache.ibatis.annotations.Param;

/**
 * Created by yewangwang on 2016/5/14.
 */
public interface IChengjiDao {
    int save(Chengji chengji);
    Chengji findOne(@Param("kechengId")String kechengId,
                    @Param("xueshengId")String xueshengId
                    );

}
