package com.atguigu.springcloud.alibaba.dao;

/*
@author YG
@create 2022/12/3   22:44
*/

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StorageDao {
    /**
     * 扣减库存
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
