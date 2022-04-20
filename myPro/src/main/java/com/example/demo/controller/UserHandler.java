package com.example.demo.controller;

import com.example.demo.entity.User2;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserHandler {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/findAll")
    public List<User2> findAll(){
        return userRepository.findAll();
    }
}
