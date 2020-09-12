package com.fk.easygo.service.impl;

import com.fk.easygo.mapper.ContentMapper;
import com.fk.easygo.pojo.Content;
import com.fk.easygo.service.ContentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ContentServiceImpl
 * @Description TODO
 * @Date 2020/3/31 9:07
 * @Created by FangKun
 */
@Service
public class ContentServiceImpl implements ContentService {
    @Resource
    ContentMapper contentMapper;

    @Override
    public Integer getTotalCount() {
        return contentMapper.getTotalCount();
    }

    @Override
    public List<Content> getContents(Map<String, Object> map) {
        return contentMapper.getContents(map);
    }

    @Override
    public List<Content> getContentsByCategoryId(Integer categoryId) {
        return contentMapper.getContentsByCategoryId(categoryId);
    }

    @Override
    public Integer updateStatus(Map<String, Object> map) {
        return contentMapper.updateStatus(map);
    }

    @Override
    public Integer addContent(Content content) {
        return contentMapper.addContent(content);
    }

    @Override
    public int deleteContent(Integer id) {
        return contentMapper.deleteContent(id);
    }

    @Override
    public Content getContentById(Integer id) {
        return contentMapper.getContentById(id);
    }

    @Override
    public Integer updateContent(Content content) {
        return contentMapper.updateContent(content);
    }

}
