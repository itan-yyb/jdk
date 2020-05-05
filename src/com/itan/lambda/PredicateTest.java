package com.itan.lambda;

import org.junit.Test;

import java.util.function.Predicate;

public class PredicateTest {
//    @Test
//    public void test(){
//        PredicateMethod(s->s.length()>5,"HelloWorld");
//    }
//    private void PredicateMethod(Predicate<String> predicate,String str){
//        boolean flag=predicate.test(str);
//        System.out.println("判断结果"+flag);
//    }
    @Test
    public void test(){
        PredicateDefaultNegateMethod(s->s.length()<5,"HelloWorld");
    }
    private void PredicateDefaultNegateMethod(Predicate<String> one,String str){
        boolean flag=one.negate().test(str);
        System.out.println("判断结果"+flag);
    }
//    @Test
//    public void test(){
//        PredicateDefaultAndMethod(s->s.contains("H"),s->s.contains("P"));
//    }
//    private void PredicateDefaultAndMethod(Predicate<String> one,Predicate<String> two){
//        boolean flag=one.or(two).test("HelloWorld");
//        System.out.println("判断结果"+flag);
//    }
}
