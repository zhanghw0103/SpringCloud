package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String infoOk(Integer id) {
        return "PaymentFallbackService----ok";
    }

    @Override
    public String infoTimeout(Integer id) {
        return "PaymentFallbackService-----timeout";
    }
}
