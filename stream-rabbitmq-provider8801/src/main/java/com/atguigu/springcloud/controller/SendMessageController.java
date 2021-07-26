package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.service.IMessageProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class SendMessageController {
    @Resource
    private IMessageProviderService messageProviderService;

    @GetMapping(value = "/sendmsg")
    public String sendMessage() {
        return messageProviderService.send();
    }

}

