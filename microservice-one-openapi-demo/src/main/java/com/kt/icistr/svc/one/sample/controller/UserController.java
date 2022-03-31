package com.kt.icistr.svc.one.sample.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.tags.Tag;

import com.kt.icistr.svc.one.sample.entity.User;

@Tag(name = "user", description = "사용자 API")
@RestController
@RequestMapping("/users")
public class UserController {

    
    @Operation(summary = "사용자 정보 조회", description = "UserId를 이용하여 사용자 정보를 조회합니다.")
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
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
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Object findUsers(
            @RequestHeader(value = "User-Agent") String userAgent,
            @ModelAttribute User user){

        return true;
    }

    @Operation(summary = "사용자 생성", description = "신규 사용자를 생성합니다.")
    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Object CreateUser(
            @RequestHeader(value = "User-Agent") String userAgent,
            @RequestBody(required = true) User user){

        return true;
    }
    
    @Operation(summary = "사용자 수정", description = "사용자를 수정합니다.")
    @PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Object ModifyUser(
            @RequestHeader(value = "User-Agent") String userAgent,
            @RequestBody(required = true) User user){

        return true;
    }
    
    @Operation(summary = "사용자 삭제", description = "사용자를 삭제합니다.")
    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Object DeleteUser(
            @RequestHeader(value = "User-Agent") String userAgent,
            @RequestBody(required = true) User user){

        return true;
    }
}
