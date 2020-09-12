package com.fk.easygo.mapper;

import com.fk.easygo.pojo.ContentCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @ClassName ContentCategoryMapper
 * @Description TODO
 * @Date 2020/3/30 22:03
 * @Created by FangKun
 */
@Mapper
public interface ContentCategoryMapper {
    //查询总数
    public Integer getTotalCount(Map<String, Object> map);
    //分页数据
    public List<ContentCategory> getContentCategoryPages(Map<String, Object> map);
    //添加
    public int addContentCategory(ContentCategory category);
    //修改
    public int updateContentCategory(ContentCategory category);
    //删除
    public int deleteContentCategory(Integer id);
    //
    public ContentCategory getById(Integer id);

    //查询所有的广告分类--下拉框使用
    public List<ContentCategory> getContentCategorys();
}
