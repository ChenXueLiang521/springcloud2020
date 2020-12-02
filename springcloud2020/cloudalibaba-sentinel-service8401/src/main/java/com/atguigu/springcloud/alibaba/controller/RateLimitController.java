package com.atguigu.springcloud.alibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: chenxueliang
 * @date: 2020/12/2 17:00
 */
@RestController
public class RateLimitController {

    @GetMapping("/testA")
    public String getTestA(){
        return "-------testA";
    }
}
