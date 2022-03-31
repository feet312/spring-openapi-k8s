package com.kt.icistr.svc.one.sample.entity;

import io.swagger.v3.oas.annotations.*;
import lombok.Data;

@Data
public class User {
    @Parameter(description = "사용자 이름", required = false, example = "홍길동")
    private String userName;
    @Parameter(description = "휴대폰 번호", required = false, example = "010-0000-0000")
    private String phoneNumber;
}