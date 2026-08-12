package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/test")
    public String test() {
        return "API is working";
    }

    @GetMapping("/welcome")
    public String welcome() {return "Welcome User";}
}
