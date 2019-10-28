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
     * @api {POST} /hello 添加用户需求
     * @apiVersion 1.0.0
     * @apiGroup NEED
     *
     * @apiParam {String} need_name 需求者名称-非空
     * @apiParam {String} e_mail 用户邮箱-非空邮箱格式
     * @apiParam  {String} phone 用户电话-非空
     * @apiParam {String} company_name 需求公司名称-非空
     * @apiParam  {String} needs_desc 需求描述-非空
     *
     * @apiSuccess {Object} code 返回码
     * @apiSuccess {Object} reason  中文解释
     * @apiSuccess {String[]} data  返回数据
     *
     * @apiSuccessExample {json} Success-Response:
     *     HTTP/1.1 200 OK
     *     {
     *          "code":0,
     *          "reason":"需求已经提交了，我们的工作人员会在2个工作日内和您取得联系!",
     *          "data":[]
     *      }
     */

    @PostMapping("/add")
    public Mono<String> add(@RequestBody @Valid User user ) {
        System.out.println(user);
        return Mono.just("User added");
    }
}
