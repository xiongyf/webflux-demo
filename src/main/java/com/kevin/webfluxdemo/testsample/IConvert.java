package com.kevin.webfluxdemo.testsample;

@FunctionalInterface
public interface IConvert<F,R> {

    R convert(F from);

}
