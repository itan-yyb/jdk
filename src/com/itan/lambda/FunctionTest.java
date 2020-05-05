package com.itan.lambda;

import org.junit.Test;

import java.util.function.Function;

public class FunctionTest {
//    @Test
//    public void test(){
//        Integer i = parseInteger(s -> Integer.parseInt(s), "10");
//        System.out.println(i);
//    }
//
//    private Integer parseInteger(Function<String,Integer> function,String str){
//        return function.apply(str);
//    }
    @Test
    public void test(){
        Integer i = defaultAndThenMethod(s -> Integer.parseInt(s)+10, s1->s1*10);
        System.out.println(i);
    }

    private Integer defaultAndThenMethod(Function<String,Integer> one,Function<Integer,Integer> two){
        return one.andThen(two).apply("10");
    }
}
