package com.kevin.webfluxdemo.testsample;


import com.kevin.webfluxdemo.sys.pojo.User;
import org.junit.Test;

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

    @Test
    public void doubleColon() {
        IConvert<String, User> convert = this::say;
        User user = convert.convert("Tom");
        System.out.println(user);
    }

    public User say(String name) {
        User user=new User();
        user.setName(name);
        return user;
    }


}
