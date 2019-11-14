package com.kevin.webfluxdemo;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class RetryTestService {

    @Retryable(backoff = @Backoff(delay = 3000))
    public void hello(String s) {
        System.out.println(LocalDateTime.now());
        if (s == null) {
            throw new RuntimeException();
        }
    }
}
