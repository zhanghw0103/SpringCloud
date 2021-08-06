package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class AliRibbonPayment9003
{
    public static void main(String[] args) {
        SpringApplication.run(AliRibbonPayment9003.class, args);
    }
}
