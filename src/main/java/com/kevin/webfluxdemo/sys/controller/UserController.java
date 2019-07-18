package com.kevin.webfluxdemo.sys.controller;

import com.kevin.webfluxdemo.sys.pojo.User;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/hello")
    public Mono<String> hello() {   // 【改】返回类型为Mono<String>
        return Mono.just("Welcome to reactive world ~");     // 【改】使用Mono.just生成响应式数据
    }

    @PostMapping("/hello")
    public Mono<String> postHello(@RequestBody User user ) {
        System.out.println(user);
        return Mono.just("Welcome to reactive world ~");
    }
}
