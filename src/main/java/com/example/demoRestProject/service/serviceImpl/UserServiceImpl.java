package com.example.demoRestProject.service.serviceImpl;

import com.example.demoRestProject.dto.UserDto;
import com.example.demoRestProject.entity.User;
import com.example.demoRestProject.repository.UserRepository;
import com.example.demoRestProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void createUser(UserDto userDto) {
        userRepository.save(new User(userDto));
    }

    @Override
    public void updateUser(User user, UserDto userDto) {
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setFullName(userDto.getFullName());
        userRepository.save(user);
    }
}
