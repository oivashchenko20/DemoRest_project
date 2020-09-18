package com.example.demoRestProject.controller;

import com.example.demoRestProject.entity.User;
import com.example.demoRestProject.service.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MainController {
    private final UserServiceImpl userServiceImpl;

    @Autowired
    public MainController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }


    @RequestMapping("/")
    public List<User> findUsers() {
        return userServiceImpl.findAllUsers();
    }
}