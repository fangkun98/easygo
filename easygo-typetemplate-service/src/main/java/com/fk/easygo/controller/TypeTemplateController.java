package com.fk.easygo.controller;

import com.fk.easygo.pojo.TypeTemplate;
import com.fk.easygo.service.TypeTemplateService;
import com.fk.easygo.utils.JsonUtils;
import com.fk.easygo.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName TypeTemplateController
 * @Description TODO
 * @Date 2020/4/4 16:23
 * @Created by FangKun
 */
@RestController
@Scope("prototype")
public class TypeTemplateController {

    @Autowired
    TypeTemplateService typeTemplateService;



    /**
     * 01-所有的模板
     * @return
     */
    @RequestMapping("/typeTemplate_all")
    public List<TypeTemplate> getTypeTemplates() {
        return typeTemplateService.getTypeTemplates();
    }


    /**
     * 根据ID查询
     * @param id
     * @return
     */
    @RequestMapping("/typeTemplate_getById")
    public TypeTemplate getTypeTemplateById(@RequestParam Integer id){
        return typeTemplateService.getTypeTemplateById(id);
    }


    /**
     * 新增模板
     * @param typeTemplate
     * @return
     */
    @RequestMapping("/typeTemplate_add")
    public Integer addTypeTemplate(@RequestBody TypeTemplate typeTemplate) {
        return typeTemplateService.addTypeTemplate(typeTemplate);
    }

    @RequestMapping("typeTemplate_page")
    public PageUtils<TypeTemplate> getTypeTemplatePage(@RequestParam(defaultValue = "1", required = false) Integer pageIndex,
                                                       @RequestParam(defaultValue = "5", required = false) Integer pageSize,
                                                       @RequestParam(defaultValue = "", required = false) String name) {
        Map<String, Object> map = new HashMap<>(0);
        map.put("pageStart", (pageIndex - 1) * pageSize);
        map.put("pageSize", pageSize);
        map.put("name", "%" + name + "%");
        System.out.println("条件:" + map);
        Integer totalCount = typeTemplateService.getTotalCount(map);
        List<TypeTemplate> typeTemplates = typeTemplateService.getTypeTemplatePage(map);


        for (TypeTemplate typeTemplate : typeTemplates) {

            String brand_ids = JsonUtils.parseJson(typeTemplate.getBrand_ids()); //格式化JSON 品牌
            typeTemplate.setBrand_ids(brand_ids);

            String spec_ids = JsonUtils.parseJson(typeTemplate.getSpec_ids()); //格式化JSON 规格
            typeTemplate.setSpec_ids(spec_ids);

            String custom_attribute_items = JsonUtils.parseJson(typeTemplate.getCustom_attribute_items()); //格式化JSON 拓展属性
            typeTemplate.setCustom_attribute_items(custom_attribute_items);
        }

        PageUtils<TypeTemplate> pageUtils = new PageUtils<TypeTemplate>(pageIndex, pageSize, totalCount, typeTemplates);
        System.out.println("数据:" + pageUtils);
        return pageUtils;
    }



}
