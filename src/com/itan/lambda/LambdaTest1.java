package com.itan.lambda;

public class LambdaTest1 {
    public static void main(String[] args) {
        /**
         * 普通开启线程（Runnable）
         * 1.new Runnable()
         * 2.实现run方法
         * 3.new Thread(runnable).start()
         */
        Runnable runnable1=new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<=10;i++){
                    System.out.println("线程1开启了，"+i);
                }
            }
        };
        Runnable runnable2=new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<=10;i++){
                    System.out.println("线程2开启了，"+i);
                }
            }
        };
        Runnable runnable3=new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<=10;i++){
                    System.out.println("线程3开启了，"+i);
                }
            }
        };
        new Thread(runnable1).start();
        new Thread(runnable2).start();
        new Thread(runnable3).start();
    }
}
