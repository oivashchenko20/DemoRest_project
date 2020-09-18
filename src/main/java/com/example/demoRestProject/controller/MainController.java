package com.example.demoRestProject.controller;

import com.example.demoRestProject.entity.User;
import com.example.demoRestProject.service.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demoRestProject.dto.UserDto;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/users")
public class MainController {
    private final UserServiceImpl userServiceImpl;

    @Autowired
    public MainController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping
    public List<User> findUsers() {
        return userServiceImpl.findAllUsers();
    }

    @PostMapping("/create")
    public void createUser(UserDto userDto){
        userServiceImpl.createUser(userDto);
    }

    @PostMapping("/update")
    public void updateUser(User user, UserDto userDto) {
        userServiceImpl.updateUser(user, userDto);
    }
}