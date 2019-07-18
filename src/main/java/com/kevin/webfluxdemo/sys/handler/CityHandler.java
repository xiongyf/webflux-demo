package com.kevin.webfluxdemo.sys.handler;

import com.kevin.webfluxdemo.sys.pojo.User;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class CityHandler {
    public Mono<ServerResponse> helloCity(ServerRequest request) {
        System.out.println("CityHandler");
        Mono<User> mono=request.bodyToMono(User.class);
        System.out.println(mono);
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject("Hello, City!"));
    }


}
