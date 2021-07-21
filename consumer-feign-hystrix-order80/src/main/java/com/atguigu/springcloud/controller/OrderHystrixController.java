package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderHystrixController {
    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String infoOk(@PathVariable("id") Integer id){
        String res = paymentHystrixService.infoOk(id);
        return res;
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    public String infoTimeout(@PathVariable("id") Integer id){
        String res = paymentHystrixService.infoTimeout(id);
        return res;
    }
}
