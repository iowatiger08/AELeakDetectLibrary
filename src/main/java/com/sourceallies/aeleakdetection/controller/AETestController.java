package com.sourceallies.aeleakdetection.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AETestController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
