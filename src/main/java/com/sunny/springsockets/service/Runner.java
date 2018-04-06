package com.sunny.springsockets.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Runner {
    @Autowired
    CallService callService;

    @PostConstruct
    public void sendMessages() {
        System.out.println("Runner!");
        callService.start();
    }

}
//@Component
//public class Runner {
//    @Autowired
//    CallService initiateMessageService;
//
//    @PostConstruct
//    public void sendMessages() {
//        initiateMessageService.start();
//    }
//
//}