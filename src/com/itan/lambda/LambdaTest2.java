package com.itan.lambda;

public class LambdaTest2 {
    public static void main(String[] args) {
        /**
         * Lambda的思想，只关注做什么，而不关注怎么实现
         */
        Runnable runnable = ()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("线程1开启了，"+i);
            }
        };
        new Thread(runnable).start();
        /**
         * 简化
         */
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("线程2开启了，" + i);
            }
        }).start();
    }
}
