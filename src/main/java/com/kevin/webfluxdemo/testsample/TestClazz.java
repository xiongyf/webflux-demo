package com.kevin.webfluxdemo.testsample;


import com.kevin.webfluxdemo.sys.pojo.User;
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
        for (int i = 0; i < 12; i++) {
            strings.add(i + "");
        }
        System.out.println(extractList(strings, 11, 20));
    }

    public List extractList(List list, int start, int num) {
        if (list == null || list.size() < 1) {
            return null;
        }
        int size = list.size();
        if (size < num) {
            return list;
        }
        List subList = new ArrayList();
        if (start + num < size) {
            for (int i = start - 1; i < start + num - 1; i++) {
                subList.add(list.get(i));
            }
        } else {
            for (int i = start - 1; i < list.size(); i++) {
                subList.add(list.get(i));
            }
        }

        return subList;
    }

}
