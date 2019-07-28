package com.kevin.webfluxdemo.testsample;


import com.kevin.webfluxdemo.sys.pojo.User;
import com.kevin.webfluxdemo.utils.ListUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestClazz {

    public void lambadaTest() {

        LambadaInterface lambadaInterface = name -> System.out.println("Hello, " + name);
        lambadaInterface.hello("Tom");

        test2((name -> System.out.println("Hello, " + name)));

        new Thread(() -> {
            System.out.println(22222);
            System.out.println(33333);
        }).start();
    }

    public void test2(LambadaInterface lambadaInterface) {
        lambadaInterface.hello("Victoria");
    }

    public void doubleColon() {
        IConvert<String, User> convert = this::say;
        User user = convert.convert("Tom");
        System.out.println(user);
    }

    public User say(String name) {
        User user = new User();
        user.setName(name);
        return user;
    }


    @Test
    public void extract() {
        List<String> strings = new ArrayList<>();
        for (int i = 1; i <= 22; i++) {
            strings.add(i + "");
        }
        System.out.println(ListUtils.pagingList(strings, -6, 50));
    }



}
