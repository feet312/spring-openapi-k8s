package com.microservice.two.microservicetwo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/hello-two")
    public String hello(@RequestParam(required = false) String id) {
        return "Hello " + (id == null ? "World" : id) + " from Two!!!!";
    }
}
