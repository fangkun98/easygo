package com.fk.easygo.mapper;

import com.fk.easygo.pojo.TypeTemplate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @ClassName TypeTemplateMapper
 * @Description TODO
 * @Date 2020/4/4 15:47
 * @Created by FangKun
 */
@Mapper
public interface TypeTemplateMapper {
    public Integer getTotalCount(Map<String,Object> map);

    public List<TypeTemplate> getTypeTemplatePage(Map<String,Object> map);

    public Integer addTypeTemplate(TypeTemplate typeTemplate);

    public TypeTemplate getTypeTemplateById(Integer id);

    public List<TypeTemplate> getTypeTemplates();

}
