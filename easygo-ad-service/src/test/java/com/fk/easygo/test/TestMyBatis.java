package com.fk.easygo.test;

import com.fk.easygo.AdServiceApp;
import com.fk.easygo.mapper.ContentCategoryMapper;
import com.fk.easygo.mapper.ContentMapper;
import com.fk.easygo.pojo.Content;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName TestMyBatis
 * @Description TODO
 * @Date 2020/3/30 22:11
 * @Created by FangKun
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AdServiceApp.class)
public class TestMyBatis {

    @Resource
    ContentCategoryMapper contentCategoryMapper;

    @Resource
    ContentMapper contentMapper;



    @Test
    public void testDelete(){
        int count = contentCategoryMapper.deleteContentCategory(1);
        System.out.println(count>0?"删除成功":"删除失败");
    }

    @Test
    public void testGetTotalCount(){
        String key="";
        Map<String,Object> map=new HashMap<>();
        map.put("name","%"+key+"%");
        Integer totalCount = contentCategoryMapper.getTotalCount(map);
        System.out.println("总数是:"+totalCount);
    }

    @Test
    public void testGetContentsByCateId(){
        List<Content> contents = contentMapper.getContentsByCategoryId(1);
        for (Content content : contents) {
            System.out.println(content);
        }
    }


}