package com.sunny.springsockets.controller;

import com.sunny.springsockets.model.Call;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class CallController {
    @Autowired
    private SimpMessagingTemplate template;

    public void sendCall() {
        String time = new SimpleDateFormat("HH:mm").format(new Date());
        Call call = new Call();
        call.setEmail("Sunny@Allstate.com");
        call.setName("Sunny");
        call.setTime(time);
        this.template.convertAndSend("/topic/calls", call);
        System.out.println("call sent!");
    }
}