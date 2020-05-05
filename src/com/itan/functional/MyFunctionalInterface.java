package com.itan.functional;

@FunctionalInterface
public interface MyFunctionalInterface {
    /**
     * 仅有的抽象方法
     */
    void method();

    /**
     * 默认方法
     */
    default void defaultMethod(){
        System.out.println("接口默认方法");
    };
}
