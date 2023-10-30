package com.example.springbootjwtsecurity.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

// TODO: 9
@Data
@AllArgsConstructor
public class RegisterUserRequest {
    private String email;
    private String fullName;
    private String username;
    private String password;
}