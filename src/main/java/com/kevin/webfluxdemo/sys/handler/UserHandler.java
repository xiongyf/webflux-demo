package com.kevin.webfluxdemo.sys.handler;

import com.kevin.webfluxdemo.sys.pojo.User;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class UserHandler {

    public Mono<ServerResponse> hello(ServerRequest request) {
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject("Hello, user!"));
    }

    public Mono<ServerResponse> create(ServerRequest request) {
        Mono<User> userMono = request.bodyToMono(User.class);
        return userMono.flatMap(user -> {
            System.out.println(user.toString());
            return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
                    .body(BodyInserters.fromObject("User created"));
        });

    }

}
