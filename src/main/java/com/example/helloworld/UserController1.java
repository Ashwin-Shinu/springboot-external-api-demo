package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController1 {

    private final UserService1 userService1;

    public UserController1(UserService1 userService) {
        this.userService1 = userService;
    }

    @GetMapping("/getuser")
    public User1 getUser() {
        return userService1.getUser();
    }
}