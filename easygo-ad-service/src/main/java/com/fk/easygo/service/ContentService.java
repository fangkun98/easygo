package com.fk.easygo.service;

import com.fk.easygo.pojo.Content;

import java.util.List;
import java.util.Map;

/**
 * @ClassName ContentService
 * @Description TODO
 * @Date 2020/3/31 9:06
 * @Created by FangKun
 */
public interface ContentService {
    public Integer getTotalCount();

    public List<Content> getContents(Map<String,Object> map);

    //查询指定类目下的所有有效广告
    public List<Content> getContentsByCategoryId(Integer categoryId);

    //有效无效功能
    public Integer updateStatus(Map<String,Object> map);

    //新增广告
    public Integer addContent(Content content);

    //删除
    public int deleteContent(Integer id);

    //根据ID查询对象
    public Content getContentById(Integer id);

    //更新广告
    public Integer updateContent(Content content);
}
