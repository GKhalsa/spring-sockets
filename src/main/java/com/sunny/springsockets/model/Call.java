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
