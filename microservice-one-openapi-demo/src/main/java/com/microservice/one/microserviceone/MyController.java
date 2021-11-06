package com.microservice.one.microserviceone;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/hello-one")
    public String hello(@RequestParam(required = false) String id) {
        return "Hello " + (id == null ? "World" : id) + " from One!!!!";
    }
}
