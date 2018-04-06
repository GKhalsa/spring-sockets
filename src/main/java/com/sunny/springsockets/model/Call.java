package com.sunny.springsockets.model;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class Call {
    private String name;
    private String email;
    private String time;

    public Call(String name, String email, String time) {
        this.name = name;
        this.email = email;
        this.time = time;
    }
}
