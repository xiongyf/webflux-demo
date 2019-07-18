package com.kevin.webfluxdemo.config;

import com.kevin.webfluxdemo.sys.handler.CityHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class RouterConfig {

    @Bean
    public RouterFunction<ServerResponse> cityRouter(CityHandler cityHandler) {

        return RouterFunctions.route(
                GET("/hello").and(accept(MediaType.ALL)), cityHandler::helloCity)
                ;

    }
}
