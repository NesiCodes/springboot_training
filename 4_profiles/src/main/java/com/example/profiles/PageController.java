package com.example.profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    @Value("${spring.profiles.active}")
    private String env;

    @Value("${msg}")
    private String msg;

    @GetMapping("/")
    public String home(){
        return msg;
    }
}
