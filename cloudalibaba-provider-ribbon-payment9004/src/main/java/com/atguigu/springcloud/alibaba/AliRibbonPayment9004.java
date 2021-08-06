package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class AliRibbonPayment9004
{
    public static void main(String[] args) {
        SpringApplication.run(AliRibbonPayment9004.class, args);
    }
}
