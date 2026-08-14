package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/test")
    public String test() {
        return "API is working";
    }

    @GetMapping("/greeting")
    public String greeting() {
        return "Good Morning!";
    }

    @GetMapping("/date")
    public String getDate() {
        return "Today's date is: " + java.time.LocalDate.now();
    }
}
