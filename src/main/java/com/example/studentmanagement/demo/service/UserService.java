package com.example.studentmanagement.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.studentmanagement.demo.dto.UserRegistrationDto;
import com.example.studentmanagement.demo.model.User;

public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}
