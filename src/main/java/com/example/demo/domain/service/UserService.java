package com.example.demo.domain.service;

import com.example.demo.domain.User;
import com.example.demo.domain.UserRepository;
import com.example.demo.domain.dto.UserRequest.SaveUserRequest;
import com.example.demo.domain.dto.UserRequest.UpdateUserRequest;
import com.example.demo.domain.dto.UserResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.hibernate.sql.Update;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserResponse save(SaveUserRequest request) {
        User user = User. builder()
                .user_name(request.getUser_name())
                .password(request.getPassword())
                .build();

        User save = userRepository.save(user);

        return new UserResponse(save);
    }

    public UserResponse findUser(Long user_id) {
        User user = userRepository.findById(user_id)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
        return new UserResponse(user);
    }

    @Transactional
    public UserResponse update(UpdateUserRequest request) {
        User user = userRepository.findById(request.getUser_id())
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        user.update(request.getUser_name(), request.getPassword());
        //유저 객체의 update method

        return new UserResponse(user);
    }

    public void deleteUser(Long user_id) {
        userRepository.deleteById(user_id);
    }
}
