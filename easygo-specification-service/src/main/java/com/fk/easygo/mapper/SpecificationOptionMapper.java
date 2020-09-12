package com.fk.easygo.mapper;

import com.fk.easygo.pojo.SpecificationOption;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName SpecificationOptionMapper
 * @Description TODO
 * @Date 2020/4/2 21:50
 * @Created by FangKun
 */
@Mapper
public interface SpecificationOptionMapper {
    //新增
    public int addSpecificationOption(SpecificationOption option);

    public List<SpecificationOption> getSpecificationOptionsBySpecificationId(Integer specificationId);

    public int updateSpecificationOption(SpecificationOption option);

    public int deleteSpecificationOptions(int spec_id);
}
