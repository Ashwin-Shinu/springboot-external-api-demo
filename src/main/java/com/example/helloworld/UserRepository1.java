package com.example.helloworld;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository1 {

    public User1 getUser1() {
        return new User1(1, "Ashwin");
    }
}