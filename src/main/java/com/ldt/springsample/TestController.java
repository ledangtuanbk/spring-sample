package com.ldt.springsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/run")
    public String run(){
        System.out.println(LocalDateTime.now());
        return "hello";
    }
}
