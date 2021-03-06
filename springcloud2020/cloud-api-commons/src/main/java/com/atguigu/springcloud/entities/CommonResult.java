package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: chenxueliang
 * @date: 2020/9/17 15:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T>{
    private Integer code;
    private String  message;
    private T data;

    public CommonResult(Integer code,String  message){
        this(code,message,null);
    }

}
