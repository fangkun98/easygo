package com.fk.easygo.service.impl;

import com.fk.easygo.mapper.ContentCategoryMapper;
import com.fk.easygo.pojo.ContentCategory;
import com.fk.easygo.service.ContentCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ContentCategoryServiceImpl
 * @Description TODO
 * @Date 2020/3/30 23:16
 * @Created by FangKun
 */
@Service
public class ContentCategoryServiceImpl implements ContentCategoryService {
    @Resource
    ContentCategoryMapper contentCategoryMapper;

    @Override
    public Integer getTotalCount(Map<String, Object> map) {
        return contentCategoryMapper.getTotalCount(map);
    }

    @Override
    public List<ContentCategory> getContentCategoryPages(Map<String, Object> map) {
        return contentCategoryMapper.getContentCategoryPages(map);
    }

    @Override
    public int addContentCategory(ContentCategory category) {
        return contentCategoryMapper.addContentCategory(category);
    }

    @Override
    public int updateContentCategory(ContentCategory category) {
        return contentCategoryMapper.updateContentCategory(category);
    }

    @Override
    public int deleteContentCategory(Integer id) {
        return contentCategoryMapper.deleteContentCategory(id);
    }

    @Override
    public ContentCategory getById(Integer id) {
        return contentCategoryMapper.getById(id);
    }

    @Override
    public List<ContentCategory> getContentCategorys() {
        return contentCategoryMapper.getContentCategorys();
    }
}
