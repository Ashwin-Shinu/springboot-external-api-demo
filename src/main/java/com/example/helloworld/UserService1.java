package com.example.helloworld;

import org.springframework.stereotype.Service;

@Service
public class UserService1 {

    private final UserRepository1 userRepository1;

    public UserService1(UserRepository1 userRepository) {
        this.userRepository1 = userRepository;
    }
    git add .
    public User1 getUser() {
        return userRepository1.getUser1();
    }
}
