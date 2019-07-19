package com.kevin.webfluxdemo.config;

import com.kevin.webfluxdemo.sys.handler.UserHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;

@Configuration
public class RouterConfig {

    @Bean
    public RouterFunction<ServerResponse> userRouter(UserHandler userHandler) {

        return  RouterFunctions.route(GET("/hello").and(accept(MediaType.ALL)), userHandler::hello)
                .andRoute(POST("/user").and(contentType(APPLICATION_JSON)), userHandler::create);
    }
}
