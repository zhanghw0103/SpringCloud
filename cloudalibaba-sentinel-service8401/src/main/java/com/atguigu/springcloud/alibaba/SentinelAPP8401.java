package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class SentinelAPP8401
{
    public static void main(String[] args) {
        SpringApplication.run(SentinelAPP8401.class, args);
    }
}
