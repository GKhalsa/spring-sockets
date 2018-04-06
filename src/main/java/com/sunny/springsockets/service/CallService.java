package com.sunny.springsockets.service;

import com.sunny.springsockets.controller.CallController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CallService extends Thread {
    @Autowired
    CallController callController;

    @Override
    public void run() {
        while (true) {
            try {
                callController.sendCall();
                System.out.println("fire!!");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
//@Component
//class CallService extends Thread {
//
//    @Autowired
//    CallController messageController;
//
//    @Override
//    public void run() {
//        while (true) {
//            try {
//                messageController.fireMessage();
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("random stuff");
//        }
//    }
//}