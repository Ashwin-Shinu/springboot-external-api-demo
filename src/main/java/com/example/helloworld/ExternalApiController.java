package com.example.helloworld;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ExternalApiController {

    @GetMapping("/external-user")
    public String getExternalUser() {

        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(
                "https://jsonplaceholder.typicode.com/users/1",
                String.class
        );
    }
}

