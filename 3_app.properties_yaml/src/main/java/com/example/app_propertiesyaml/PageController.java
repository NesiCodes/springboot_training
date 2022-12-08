package com.example.app_propertiesyaml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PageController {

    @Value("${pageController.msg}")
    private String msg;

    @Value("${my.secret}")
    private String mySecret;

    @Value("${my.number}")
    private int randomNum;

    @GetMapping("/")
    public String greet(){
        return msg;
    }

    @GetMapping("/secret")
    public String secret(){
        return mySecret;
    }

    @GetMapping("/randomNum")
    public int generateRandomNum(){
        return randomNum;
    }
}
