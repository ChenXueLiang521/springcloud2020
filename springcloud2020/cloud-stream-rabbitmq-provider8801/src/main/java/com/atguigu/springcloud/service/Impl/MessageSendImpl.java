package com.atguigu.springcloud.service.Impl;

import com.atguigu.springcloud.service.IMessageSendService;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @description:
 * @author: chenxueliang
 * @date: 2020/11/30 9:49
 */
@EnableBinding(Source.class)
public class MessageSendImpl implements IMessageSendService {

    @Resource
    private MessageChannel output;

    @Override
    public void sendMessage() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("##########serial: "+serial);
    }
}
