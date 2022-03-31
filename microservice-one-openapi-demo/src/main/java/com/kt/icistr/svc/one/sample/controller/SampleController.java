package com.kt.icistr.svc.one.sample.controller;

import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api")
public class SampleController {

	@Operation(summary = "샘플 GET 테스트", description = "GET Method를 테스트 합니다. ")
    @GetMapping("/hello-one")
    public String hello(@RequestParam(required = false) String id) {
        return "Hello " + (id == null ? "World" : id) + " from One!";
    }
 
    @Operation(summary = "샘플 POST 테스트", description = "POST Method를 테스트 합니다. ")
    @PostMapping("/hello-one")
    public String hello2(@RequestParam(required = false) String id) {
        return "Hello post " + (id == null ? "World" : id) + " from One!!";
    }
    
}
