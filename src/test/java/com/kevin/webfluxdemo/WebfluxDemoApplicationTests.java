package com.kevin.webfluxdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebfluxDemoApplicationTests {

    @Resource
    RetryTestService retryTestService;

    @Test
    public void contextLoads() {
        retryTestService.hello(null);
    }


}
