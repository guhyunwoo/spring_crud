package com.example.demo.domain.dto.UserRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SaveUserRequest {
    private String user_name;
    private String password;
}
