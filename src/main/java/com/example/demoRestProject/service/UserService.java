package com.example.demoRestProject.service;

import com.example.demoRestProject.dto.UserDto;
import com.example.demoRestProject.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();

    void createUser(UserDto userDto);

    void updateUser(User user, UserDto userDto);
}
