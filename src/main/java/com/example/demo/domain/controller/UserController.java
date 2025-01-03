package com.example.demo.domain.controller;

import com.example.demo.domain.UserRepository;
import com.example.demo.domain.dto.UserRequest.SaveUserRequest;
import com.example.demo.domain.dto.UserResponse;
import com.example.demo.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;
    private final UserService userService;

    @PostMapping("/user")
    public UserResponse save(@RequestBody SaveUserRequest request) {
        return userService.save(request);
    }

    @GetMapping("/user?{id}")
    public UserResponse get(@PathVariable Long id) {
        return UserResponse(get(user_id == id))
    }
}
