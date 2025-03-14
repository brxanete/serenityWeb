package com.ktronix.demo.models.models;

import lombok.Data;

@Data
public class LoginData {

    private String username;
    private String password;

    public LoginData(String username, String password) {
        this.username = username;
        this.password = password;
    }

}


