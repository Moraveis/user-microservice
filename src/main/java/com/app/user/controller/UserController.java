package com.app.user.controller;

import com.app.user.model.User;
import com.app.user.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/users")
@RequiredArgsConstructor
public class UserController {

    private UserService userService;

    public List<User> getAllUsers() {
        return userService.getAllUser();
    }
}
