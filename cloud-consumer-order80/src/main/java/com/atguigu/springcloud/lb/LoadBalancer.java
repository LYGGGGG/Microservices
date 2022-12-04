package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;
/*
@author YG
@create 2022/11/23   15:41
*/

public interface LoadBalancer
{
    // 参数为服务器提供的机器总数，返回的是轮询到的单个服务器
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}