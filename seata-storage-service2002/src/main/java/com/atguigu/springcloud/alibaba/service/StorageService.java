package com.atguigu.springcloud.alibaba.service;

/*
@author YG
@create 2022/12/3   22:47
*/

public interface StorageService {

    void decrease(Long productId, Integer count);
}
