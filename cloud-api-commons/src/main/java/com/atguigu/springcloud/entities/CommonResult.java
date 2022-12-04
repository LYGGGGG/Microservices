package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
@author YG
@create 2022/11/21   13:09
*/

/**
 * 返回给前端的json串
 * @param <T>
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    // 状态码、消息
    private Integer code;
    private String  message;
    private T       data;

    // data为null的构造器
    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
