package com.sunny.springsockets.model;

import org.springframework.stereotype.Component;

public class Call {
    private String name;
    private String email;
    private String time;

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getTime() {
        return this.time;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setTime(String time){
        this.time = time;
    }
}
////@Component
//public class Call {
//
//    private String from;
//    private String text;
//    private String time;
//
//    public String getText() {
//        return text;
//    }
//
//    public String getTime() {
//        return time;
//    }
//
//    public String getFrom() {
//        return from;
//    }
//
//    public void setText(String text) {
//        this.text = text;
//    }
//
//    public void setTime(String time) {
//        this.time = time;
//    }
//
//    public void setFrom(String from) {
//        this.from = from;
//    }
//}
