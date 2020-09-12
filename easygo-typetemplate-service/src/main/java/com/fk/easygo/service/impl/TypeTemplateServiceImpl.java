package com.fk.easygo.service.impl;

import com.fk.easygo.mapper.TypeTemplateMapper;
import com.fk.easygo.pojo.TypeTemplate;
import com.fk.easygo.service.TypeTemplateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @ClassName TypeTemplateServiceImpl
 * @Description TODO
 * @Date 2020/4/4 16:22
 * @Created by FangKun
 */
@Service
public class TypeTemplateServiceImpl implements TypeTemplateService {

    @Resource
    TypeTemplateMapper typeTemplateMapper;

    @Override
    public Integer getTotalCount(Map<String, Object> map) {
        return typeTemplateMapper.getTotalCount(map);
    }

    @Override
    public List<TypeTemplate> getTypeTemplatePage(Map<String, Object> map) {
        return typeTemplateMapper.getTypeTemplatePage(map);
    }

    @Override
    public Integer addTypeTemplate(TypeTemplate typeTemplate) {
        return typeTemplateMapper.addTypeTemplate(typeTemplate);
    }

    @Override
    public TypeTemplate getTypeTemplateById(Integer id) {
        return typeTemplateMapper.getTypeTemplateById(id);
    }

    @Override
    public List<TypeTemplate> getTypeTemplates() {
        return typeTemplateMapper.getTypeTemplates();
    }

}
