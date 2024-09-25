package com.blackcode.spring_boot_auth.controller;

import com.blackcode.spring_boot_auth.model.Users;
import com.blackcode.spring_boot_auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Users register(@RequestBody Users users){
        return userService.register(users);
    }
}
