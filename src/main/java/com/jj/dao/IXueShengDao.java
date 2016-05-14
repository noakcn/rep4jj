package com.jj.dao;

import com.jj.pojo.XueSheng;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by yewangwang on 2016/5/5.
 */
public interface IXueshengDao {
    List<XueSheng> findAll(String banjiId);
    XueSheng findOne(String userId);

    int save(XueSheng xueSheng);

    List<XueSheng> findAllByConditon(@Param("banjiId")String banjiId,
                                     @Param("xingming")String xingming);

    int delete(String id);

    int update(XueSheng xueSheng);
}
