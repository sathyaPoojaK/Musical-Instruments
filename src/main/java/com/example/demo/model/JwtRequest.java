package com.example.demo.model;

import lombok.Data;

@Data
public class JwtRequest {
    private String password;
    private String email;
}
