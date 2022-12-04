package com.atguigu.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
/*
@author YG
@create 2022/11/23   22:46
*/
@SpringBootApplication
@EnableFeignClients // 激活feign !!
public class OrderFeignMain80 {
    public static void main(String[] args)
    {
        SpringApplication.run(OrderFeignMain80.class,args);
    }
}