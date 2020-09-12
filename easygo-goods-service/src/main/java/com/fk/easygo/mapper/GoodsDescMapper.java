package com.fk.easygo.mapper;

import com.fk.easygo.pojo.GoodsDesc;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName GoodsDescMapper
 * @Description TODO
 * @Date 2020/4/14 18:36
 * @Created by FangKun
 */
@Mapper
public interface GoodsDescMapper {

    public GoodsDesc getGoodsDescById(Long id);
}
