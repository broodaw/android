package com.example.findme.rest;

import com.example.findme.UserRepository;
import com.example.findme.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FindMeController {

    private final UserRepository userRepository;

    public FindMeController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("users")
    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        return users;
    }

    @PostMapping("users")
    public void add(User user) {
        userRepository.save(user);
    }
}
