package com.sms.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcomePage() {
        return "Welcome to the School Management System!";
    }

    @PostMapping("/student")
    public Map<String, Object> addStudent(@RequestBody Map<String, Object> student) {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Student added successfully");
        response.put("student", student);
        return response;
    }
}
