package com.fk.easygo.service;

import com.fk.easygo.pojo.TypeTemplate;

import java.util.List;
import java.util.Map;

/**
 * @ClassName TypeTemplateService
 * @Description TODO
 * @Date 2020/4/4 16:21
 * @Created by FangKun
 */
public interface TypeTemplateService {
    public Integer getTotalCount(Map<String,Object> map);

    public List<TypeTemplate> getTypeTemplatePage(Map<String,Object> map);

    public Integer addTypeTemplate(TypeTemplate typeTemplate);

    public TypeTemplate getTypeTemplateById(Integer id);

    public List<TypeTemplate> getTypeTemplates();
}
