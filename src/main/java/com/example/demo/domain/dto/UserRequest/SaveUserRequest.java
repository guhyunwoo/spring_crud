package com.example.demo.domain.dto.UserRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter
@AllArgsConstructor
public class SaveUserRequest {
    private String user_name;
    private String password;
    private Date created_at;
}
