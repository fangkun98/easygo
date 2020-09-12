package com.fk.easygo.listener;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

/**
 * @ClassName RedisMessageListener
 * @Description TODO Redis中key过期事件的监听程序
 * @Date 2020/4/25 15:49
 * @Created by FangKun
 */
public class RedisMessageListener implements MessageListener {

    /**
     * 当客户端监听到消息，那么自动触发这个onMessage方法
     * @param message 监听到的消息
     * @param pattern 订阅的频道基本信息
     */
    @Override
    public void onMessage(Message message, byte[] pattern) {
        //消息的消息内容
        byte[] body = message.getBody();
        System.out.println("接收到的消息是:"+new String(body));
        //订阅的频道
        byte[] channel = message.getChannel();
        System.out.println("订阅的频道是:"+new String(channel));
        //频道相关信息
        System.out.println("频道信息:"+new String(pattern));
    }
}
