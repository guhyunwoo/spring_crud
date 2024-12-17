package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@NoArgsConstructor
@Entity
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;
    @Column(nullable = false, length = 30, unique = true)
    private String user_name;
    @Column(nullable = false, length = 30)
    private String password;
    private LocalDate created_at;

    @Builder
    public User(String user_name, String password, LocalDate created_at) {
        this.user_name = user_name;
        this.password = password;
        this.created_at = (created_at != null) ? created_at : LocalDate.now();
    }

    public void update(String user_name, String password) {
        this.user_name = user_name;
        this.password = password;
    }
}