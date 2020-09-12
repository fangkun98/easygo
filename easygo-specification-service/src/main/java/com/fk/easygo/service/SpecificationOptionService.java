package com.fk.easygo.service;

import com.fk.easygo.pojo.SpecificationOption;

import java.util.List;

/**
 * @ClassName SpecificationOptionService
 * @Description TODO
 * @Date 2020/4/2 21:52
 * @Created by FangKun
 */
public interface SpecificationOptionService {
    //新增
    public int addSpecificationOption(SpecificationOption option);

    public List<SpecificationOption> getSpecificationOptionsBySpecificationId(Integer specificationId);;

    public int deleteSpecificationOptions(int spec_id);
}
