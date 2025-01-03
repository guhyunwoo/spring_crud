package com.example.demo.domain.dto;
import com.example.demo.domain.User;
import java.time.LocalDate;

public class UserResponse {
    private final Long user_id;
    private final String user_name;
    private final LocalDate created_at;

    public UserResponse(User user) {
        this.user_id = user.getUser_id();
        this.user_name = user.getUser_name();
        this.created_at = user.getCreated_at();
    }
}
