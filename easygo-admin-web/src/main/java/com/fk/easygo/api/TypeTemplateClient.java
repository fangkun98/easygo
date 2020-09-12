package com.fk.easygo.api;

import com.fk.easygo.pojo.TypeTemplate;
import com.fk.easygo.utils.PageUtils;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ClassName TypeTemplateClient
 * @Description TODO
 * @Date 2020/4/4 16:42
 * @Created by FangKun
 */
@FeignClient(value = "easygo-typetemplate-service")
public interface TypeTemplateClient {


    /**
     * 01-所有的模板
     * @return
     */
    @RequestMapping("/typeTemplate_all")
    public List<TypeTemplate> getTypeTemplates();


    /**
     * 根据ID查询
     * @param id
     * @return
     */
    @RequestMapping("/typeTemplate_getById")
    public TypeTemplate getTypeTemplateById(@RequestParam Integer id);



    @RequestMapping("/typeTemplate_add")
    public Integer addTypeTemplate(@RequestBody TypeTemplate typeTemplate);

    @RequestMapping("typeTemplate_page")
    public PageUtils<TypeTemplate> getTypeTemplatePage(@RequestParam(defaultValue = "1", required = false) Integer pageIndex,
                                                       @RequestParam(defaultValue = "5", required = false) Integer pageSize,
                                                       @RequestParam(defaultValue = "", required = false) String name);

}
