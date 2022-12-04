package com.atguigu.springcloud.alibaba.myhandler;

/*
@author YG
@create 2022/12/2   20:25
*/

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(444, "按客户自定义限流处理逻辑, global handlerException--------1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(444, "按客户自定义限流处理逻辑, global handlerException--------2");
    }
}
