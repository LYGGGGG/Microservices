package com.atguigu.springcloud.service;

/*
@author YG
@create 2022/11/21   15:29
*/

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
