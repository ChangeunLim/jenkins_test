package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class abcController {
    @GetMapping("/test")
    public String test() {
        String result = "테스트입니다.";
        return result;
    }
}
