package com.kt.icistr.svc.one;

import org.springframework.web.bind.annotation.*;

import com.kt.icistr.svc.one.sample.entity.User;

import io.swagger.v3.oas.annotations.*;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/hello-one")
    public String hello(@RequestParam(required = false) String id) {
        return "Hello " + (id == null ? "World" : id) + " from One!!!!";
    }
 
    @Operation(summary = "샘플 POST 테스트", description = "POST Method를 테스트 합니다. ")
    @PostMapping("/hello-one")
    public String hello2(@RequestParam(required = false) String id) {
        return "Hello post " + (id == null ? "World" : id) + " from One!!!!";
    }
    
    @Operation(summary = "사용자 정보 조회", description = "UserId를 이용하여 사용자 정보를 조회합니다.")
//    @GetMapping(value = "/users/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "/users/{id}")
    public Object findUser(
            @Parameter(description = "user id", required = true, example = "1")
            @PathVariable(value = "id", required = true) String id,
            @Parameter(description = "User Agent Type ", required = true, example = "Mozila")
            @RequestHeader(value = "User-Agent") String userAgent,
            @Parameter(description = "parameter1 ", required = false)
            @RequestParam(value = "param1", required = false) String param1,
            @Parameter(description = "parameter2 ", required = false)
            @RequestParam(value = "param2", required = false) String param2){

        return true;
    }

    @Operation(summary = "사용자 리스트 조회", description = "특정 조건에 맞는 사용자 리스트를 조회합니다.")
//    @GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "/users")
    public Object findUsers(
            @RequestHeader(value = "User-Agent") String userAgent,
            @ModelAttribute User user){

        return true;
    }

    @Operation(summary = "사용자 생성", description = "신규 사용자를 생성합니다.")
    @PostMapping(value = "/users")
    public Object CreateUser(
            @RequestHeader(value = "User-Agent") String userAgent,
            @RequestBody(required = true) User user){

        return true;
    }
}
