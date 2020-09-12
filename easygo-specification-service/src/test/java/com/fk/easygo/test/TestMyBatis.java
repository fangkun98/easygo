package com.fk.easygo.test;

import com.fk.easygo.mapper.SpecificationMapper;
import com.fk.easygo.pojo.Specification;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @ClassName TestMyBatis
 * @Description TODO
 * @Date 2020/4/2 22:32
 * @Created by FangKun
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMyBatis {
    @Resource
    SpecificationMapper specificationMapper;

    @Test
    public void testId(){
        Specification specification=new Specification();
        specification.setSpec_name("测试返回主键");
        Integer count = specificationMapper.addSpecification(specification);
        if(count>0){
            System.out.println("新增成功,ID值是:"+specification.getId());
        }
    }
}
