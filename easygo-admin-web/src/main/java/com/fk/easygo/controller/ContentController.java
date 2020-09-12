package com.fk.easygo.controller;

import com.fk.easygo.api.ContentCategoryClient;
import com.fk.easygo.api.ContentClient;
import com.fk.easygo.pojo.Content;
import com.fk.easygo.pojo.ContentCategory;
import com.fk.easygo.utils.FastDFSClient;
import com.fk.easygo.utils.MessageResults;
import com.fk.easygo.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ContentController
 * @Description TODO
 * @Date 2020/3/31 9:10
 * @Created by FangKun
 */
@Controller
@Scope("prototype")
public class ContentController {
    @Autowired
    ContentClient contentClient;

    @Autowired
    ContentCategoryClient contentCategoryClient;

    //操作Redis
    @Autowired
    RedisTemplate<String, Object> redisTemplate;


    /**
     * 广告分页
     * @param pageIndex
     * @param pageSize
     * @param model
     * @return
     */
    @RequestMapping("/content_page")
    public String getContent_page(@RequestParam(defaultValue = "1", required = false) Integer pageIndex,
                                  @RequestParam(defaultValue = "5", required = false) Integer pageSize, Model model) {
        PageUtils<Content> pageUtils = contentClient.getContent_page(pageIndex, pageSize);
        model.addAttribute("pageUtils",pageUtils);
        return "content";
    }


    /**
     * 修改广告的有效无效状态
     * @param id
     * @param status
     * @return
     */
    @RequestMapping("/content_updateStatus")
    @ResponseBody
    public MessageResults updateStatus(Integer id, Integer status) {
        MessageResults results=null;
        int count= contentClient.updateStatus(id, status);
        if (count > 0) {
            results = new MessageResults(200, "更新成功");
        } else {
            results = new MessageResults(500, "更新失败");
        }
        return results;
    }


    //新增广告
    @RequestMapping("/content_add")
    @ResponseBody
    public MessageResults contentAdd(Content content){
        MessageResults results=null;
        System.out.println("新增的对象是："+content);
        Integer count = contentClient.addContent(content);
        if (count > 0) {
            results = new MessageResults(200, "新增成功");
        } else {
            results = new MessageResults(500, "新增失败");
        }
        return results;

    }

    @RequestMapping("/content_delete")
    @ResponseBody
    public MessageResults deleteContent( Integer id){
        int count = contentClient.deleteContent(id);
        MessageResults results = null;
        if (count > 0) {
            results = new MessageResults(200, "删除成功");
        } else {
            results = new MessageResults(500, "删除失败");
        }
        return results;
    }

    //跳转更新页面
    @RequestMapping("/content_goupdate")
    @ResponseBody
    public Map<String, Object> contentUpdate(Integer id) {
        //广告回显的对象
        Content content = contentClient.getContentById(id);
        //查询下拉框数据
        List<ContentCategory> contentCategorys = contentCategoryClient.getContentCategorys();
        HashMap<String, Object> map = new HashMap<>();
        map.put("content", content);
        map.put("contentCategorys", contentCategorys);
        return map;
    }

    //更新广告
    @RequestMapping("/content_update")
    @ResponseBody
    public MessageResults content_update(Content content) throws Exception {
        //表单中图片地址
        String pic = content.getPic();
        //数据库的图片地址
        String oldPic = contentClient.getContentById(content.getId()).getPic();
        if (!oldPic.equals(pic)) {
            //表示图片有修改，删除FastDFS服务器中的图片
            //获取工具类,配置文件
            FastDFSClient fastDFSClient = new FastDFSClient("classpath:config/fdfs_client.conf");
            //http://192.168.6.130:8866/group1/M00/00/00/wKgGglw8Z9eALUclAADAvne7424438.jpg
            //oldPic="M00/00/00/wKgGglw8Z9eALUclAADAvne7424438.jpg"; //意味着截取字符串
            System.out.println(oldPic);

            //不是服务器的图片地址会报错
            /*String str1=oldPic.substring(0, oldPic.indexOf("group1/"));
            String str2=oldPic.substring(str1.length()+7, oldPic.length());
            System.out.println(str2);
            fastDFSClient.deleteFile(str2,"group1");*/
        }
        MessageResults results = null;
        System.out.println("更新的对象是：" + content);
        Integer count = contentClient.updateContent(content);
        if (count > 0) {

            //在此处，要么就删除lunbo_contents_key这个key，要么就把lunbo_contents_key对应的值更新
            //把广告列表ID写到配置文件中，直接发送SQL查询数据
            List<Content> lunbo_contents = contentClient.getContentsByCategoryId(1);
            //再把查询到数据，存入一份到缓存中
            redisTemplate.opsForValue().set("lunbo_contents_key", lunbo_contents);


            results = new MessageResults(200, "新增成功");
        } else {
            results = new MessageResults(500, "新增失败");
        }
        return results;
    }
}
