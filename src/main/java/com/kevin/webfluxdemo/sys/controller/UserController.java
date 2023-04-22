package com.kevin.webfluxdemo.sys.controller;

import com.kevin.webfluxdemo.sys.pojo.User;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/hello")
    public Mono<String> hello() {   // 【改】返回类型为Mono<String>
        return Mono.just("Welcome to reactive world ~");     // 【改】使用Mono.just生成响应式数据
    }

    /**
     * @api {POST} /add 添加用户
     * @apiVersion 1.0.0
     * @apiGroup NEED
     * @apiParam {String} name 名称-非空
     * @apiParam {String} phone 用户电话-非空
     * @apiSuccessExample {json} Success-Response:
     * HTTP/1.1 200 OK
     * {
     * "code":0,
     * "data":[]
     * }
     */

    @PostMapping("/add")
    public Mono<String> add(@RequestBody @Valid User user) {
        System.out.println(user);
        return Mono.just("User added");
    }
}
