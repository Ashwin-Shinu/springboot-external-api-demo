package com.example.helloworld;

import org.springframework.web.bind.annotation.
        *;

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
    @PostMapping("/user")

    public String createUser() {

        return "User created successfully";

    }
    @PutMapping("/user")
    public String updateUser() {

        return "User updated successfully";

    }
    @DeleteMapping("/user")

    public String deleteUser() {

        return "User deleted successfully";

    }
}