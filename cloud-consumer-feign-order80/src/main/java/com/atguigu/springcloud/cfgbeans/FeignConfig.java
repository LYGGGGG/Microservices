package com.atguigu.springcloud.cfgbeans;

/*
@author YG
@create 2022/11/23   23:43
*/

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}