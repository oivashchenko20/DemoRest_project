package com.example.demoRestProject.entity;

import lombok.Getter;
import lombok.Setter;
import com.example.demoRestProject.dto.UserDto;

import javax.persistence.*;

@Entity
@Table(name = "usr")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Transient
    private String confirmPassword;

    @Column(name = "fullName")
    private String fullName;

    public User() {

    }

    public User(UserDto userDto) {
        this.username = userDto.getUsername();
        this.password = userDto.getPassword();
        this.fullName = userDto.getFullName();
    }
}