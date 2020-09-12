package com.fk.easygo.controller;

import com.fk.easygo.api.SpecificationClient;
import com.fk.easygo.pojo.Specification;
import com.fk.easygo.utils.MessageResults;
import com.fk.easygo.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * @ClassName SpecificationController
 * @Description TODO
 * @Date 2020/4/2 22:26
 * @Created by FangKun
 */

@Controller
@Scope("prototype")
public class SpecificationController {
    @Autowired
    SpecificationClient specificationClient;

    @RequestMapping("/specification_add")
    @ResponseBody
    public MessageResults specification_add(String spec_name, String[] option_name, Integer[] orders){
        //两个表中的值
        System.out.println(spec_name);
        System.out.println(Arrays.toString(option_name));
        System.out.println(Arrays.toString(orders));
        MessageResults results=null;

        try {
            Integer count = specificationClient.specification_add(spec_name, option_name, orders);
            if (count > 0) {
                results = new MessageResults(200, "新增成功");
            } else {
                results = new MessageResults(500, "新增失败");
            }
        } catch (Exception e) {
            results = new MessageResults(503, "服务器异常...");
            e.printStackTrace();
        }
        return results;
    }

    /**
     * @return
     */
    @RequestMapping("/specification_page")
    public String specification_page(@RequestParam(defaultValue = "1", required = false) Integer pageIndex,
                                     @RequestParam(defaultValue = "5", required = false) Integer pageSize, @RequestParam(defaultValue = "", required = false) String spec_name, Model model) {
        PageUtils<Specification> pageUtils = specificationClient.specification_pages(pageIndex, pageSize, spec_name);
        System.out.println(pageUtils);
        model.addAttribute("pageUtils",pageUtils);
        //回显条件
        model.addAttribute("spec_name",spec_name);
        return "specification";
    }



    @RequestMapping("/specification_update")
    @ResponseBody
    public MessageResults specification_update(Integer id, String spec_name, String[] option_name, Integer[] orders) {
        //两个表中的值
        System.out.println(id);
        System.out.println(spec_name);
        System.out.println(Arrays.toString(option_name));
        System.out.println(Arrays.toString(orders));
        MessageResults results = null;
        try {
            Integer count = specificationClient.specification_update(id,spec_name, option_name, orders);
            if (count > 0) {
                results = new MessageResults(200, "更新成功");
            } else {
                results = new MessageResults(500, "更新失败");
            }
        } catch (Exception e) {
            results = new MessageResults(503, "服务器异常...");
            e.printStackTrace();
        }
        return results;
    }

    /**
     * 更新的时候数据回显
     *
     * @param id
     * @return
     */
    @RequestMapping("/specification_getById")
    @ResponseBody
    public Map<String, Object> getSpecification(@RequestParam Integer id) {
        return specificationClient.getSpecification(id);
    }
}
