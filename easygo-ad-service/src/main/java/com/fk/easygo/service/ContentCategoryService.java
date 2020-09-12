package com.fk.easygo.service;

import com.fk.easygo.pojo.ContentCategory;

import java.util.List;
import java.util.Map;

/**
 * @ClassName ContentCategoryService
 * @Description TODO
 * @Date 2020/3/30 22:55
 * @Created by FangKun
 */
public interface ContentCategoryService {
    public Integer getTotalCount(Map<String, Object> map);

    public List<ContentCategory> getContentCategoryPages(Map<String, Object> map);

    public int addContentCategory(ContentCategory category);

    public int updateContentCategory(ContentCategory category);

    public int deleteContentCategory(Integer id);

    public ContentCategory getById(Integer id);

    //查询所有的广告分类--下拉框使用
    public List<ContentCategory> getContentCategorys();
}
