package com.majed.carrental.userservice.controller;

import com.majed.carrental.userservice.repository.UserRepository;
import com.majed.carrental.userservice.repository.entity.UserEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/")
public class UserController {


    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(value = "/users", produces = APPLICATION_JSON_VALUE)
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping(value = "/users", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public UserEntity createUser(@RequestBody UserEntity user) {
        return userRepository.save(user);
    }
}