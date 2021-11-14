package com.example.studentmanagement.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


public class MainController {
    @GetMapping
    public String login() {
        return "login";
    }
}
