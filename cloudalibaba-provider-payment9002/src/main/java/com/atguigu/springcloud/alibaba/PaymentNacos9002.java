package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class PaymentNacos9002
{
    public static void main(String[] args) {
            SpringApplication.run(PaymentNacos9002.class, args);
    }
}
