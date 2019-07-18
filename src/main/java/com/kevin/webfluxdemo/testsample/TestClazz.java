package com.kevin.webfluxdemo.testsample;

public class TestClazz {

    public static void main(String[] args) {

        LambadaInterface lambadaInterface = name -> System.out.println("Hello, " + name);
        lambadaInterface.hello("Tom");

        test1((name -> System.out.println("Hello, " + name)));

        new Thread(() -> {
            System.out.println(22222);
            System.out.println(33333);
        }).start();
    }

    public static void test1(LambadaInterface lambadaInterface) {
        lambadaInterface.hello("Victoria");
    }
}
