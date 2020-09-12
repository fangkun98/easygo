package com.fk.easygo.service;

import com.fk.easygo.pojo.Specification;

import java.util.List;
import java.util.Map;

/**
 * @ClassName SpecificationService
 * @Description TODO
 * @Date 2020/4/2 21:51
 * @Created by FangKun
 */
public interface SpecificationService {

    public Integer totalCount(Map<String,Object> map);

    public List<Specification> getSpecificationPage(Map<String,Object> map);

    public Integer addSpecification(Specification specification);

    //事务版本的级联新增
    public Integer addSpecificationTransaction(String spec_name,String[] option_name,Integer[] orders);

    public Specification getSpecificationById(Integer id);

    public Integer specification_update(Integer id, String spec_name, String[] option_name,Integer[] orders);

    public List<Specification> getSpecifications();

}
