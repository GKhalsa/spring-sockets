package com.sunny.springsockets;

import com.sunny.springsockets.service.CallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Runner {
    @Autowired
    CallService callService;

    @PostConstruct
    public void sendMessages() {
        callService.start();
    }

}