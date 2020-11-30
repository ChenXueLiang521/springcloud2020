package com.atguigu.springcloud.service.controller;

import com.atguigu.springcloud.service.IMessageSendService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: chenxueliang
 * @date: 2020/11/30 9:54
 */
@RestController
public class MessageSendController {

    @Resource
    private IMessageSendService iMessageSendService;

    @GetMapping(value = "/sendMessage")
    public void sendMessage(){
        iMessageSendService.sendMessage();
    }

}
