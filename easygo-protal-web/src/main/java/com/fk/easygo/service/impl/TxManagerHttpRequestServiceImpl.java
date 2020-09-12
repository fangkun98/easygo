package com.fk.easygo.service.impl;

/**
 * @ClassName TxManagerHttpRequestServiceImpl
 * @Description TODO
 * @Date 2020/4/24 19:21
 * @Created by FangKun
 */

import com.codingapi.tx.netty.service.TxManagerHttpRequestService;
import com.lorne.core.framework.utils.http.HttpUtils;
import org.springframework.stereotype.Service;

/**
 * 常见TxManagerHttpRequestService重写get、post方法；
 */
@Service
public class TxManagerHttpRequestServiceImpl implements TxManagerHttpRequestService {

    @Override
    public String httpGet(String url) {
        System.out.println("httpGet-start");
        String res = HttpUtils.get(url);
        System.out.println("httpGet-end");
        return res;
    }

    @Override
    public String httpPost(String url, String params) {
        System.out.println("httpPost-start");
        String res = HttpUtils.post(url,params);
        System.out.println("httpPost-end");
        return res;
    }
}