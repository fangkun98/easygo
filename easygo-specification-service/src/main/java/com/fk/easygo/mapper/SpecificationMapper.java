package com.fk.easygo.mapper;

import com.fk.easygo.pojo.Specification;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @ClassName SpecificationMapper
 * @Description TODO
 * @Date 2020/4/2 21:46
 * @Created by FangKun
 */
@Mapper
public interface SpecificationMapper {
    public Integer totalCount(Map<String,Object> map);

    public List<Specification> getSpecificationPage(Map<String,Object> map);

    public Integer addSpecification(Specification specification);

    public Specification getSpecificationById(Integer id);

    public Integer updateSpecificationById(Specification specification);

    public List<Specification> getSpecifications();
}
