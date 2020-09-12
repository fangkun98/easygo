package com.fk.easygo.service.impl;

import com.fk.easygo.mapper.SpecificationOptionMapper;
import com.fk.easygo.pojo.SpecificationOption;
import com.fk.easygo.service.SpecificationOptionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName SpecificationOptionServiceImpl
 * @Description TODO
 * @Date 2020/4/2 21:52
 * @Created by FangKun
 */
@Service
public class SpecificationOptionServiceImpl implements SpecificationOptionService {

    @Resource
    SpecificationOptionMapper specificationOptionMapper;

    @Override
    public int addSpecificationOption(SpecificationOption option) {
        return specificationOptionMapper.addSpecificationOption(option);
    }

    @Override
    public List<SpecificationOption> getSpecificationOptionsBySpecificationId(Integer specificationId) {
        return specificationOptionMapper.getSpecificationOptionsBySpecificationId(specificationId);
    }

    @Override
    public int deleteSpecificationOptions(int spec_id) {
        return specificationOptionMapper.deleteSpecificationOptions(spec_id);
    }
}
