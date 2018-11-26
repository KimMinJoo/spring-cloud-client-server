package com.me.msa.clientserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Value("${test.profile}")
    private String profile;

    @GetMapping("/profile")
    public String getProfile() {
        return profile;
    }
}
