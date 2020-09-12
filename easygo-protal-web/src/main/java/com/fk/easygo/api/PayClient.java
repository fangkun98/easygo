package com.fk.easygo.api;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @ClassName PayClient
 * @Description TODO
 * @Date 2020/4/23 0:03
 * @Created by FangKun
 */
@FeignClient(value = "easygo-pay-service")
public interface PayClient {

    /**
     * 调用统一下单API，获取下单的MAP信息，得到这个MAP信息，就可以生成支付的二维码
     * https://api.mch.weixin.qq.com/pay/unifiedorder
     *
     * @param out_trade_no
     * @param total_fee
     * @return
     */
    @RequestMapping("/createNative")
    public Map createNative(@RequestParam("out_trade_no") String out_trade_no, @RequestParam("total_fee") String total_fee);

    /**
     * 02-查询订单接口 https://api.mch.weixin.qq.com/pay/orderquery
     * @param out_trade_no
     * @return
     */
    @RequestMapping("/queryPayStatus")
    public Map queryPayStatus(@RequestParam("out_trade_no") String out_trade_no);


}
