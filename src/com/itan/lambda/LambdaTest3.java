package com.itan.lambda;

import com.itan.functional.MessageBuilder;
import org.junit.Test;

public class LambdaTest3 {
    private void log(int level, MessageBuilder messageBuilder){
        if(level==1){
            System.out.println(messageBuilder.buildMessage());
        }
    }

    @Test
    public void testStringConcat(){
        String str1="hello";
        String str2="world";
        String str3="Java";
        log(2,()->str1 + str2 + str3);
    }
//    private void log(int level,String msg){
//        if(level==1){
//            System.out.println(msg);
//        }
//    }
//
//    @Test
//    public void testStringConcat(){
//        String str1="hello";
//        String str2="world";
//        String str3="Java";
//        log(1,str1 + str2 + str3);
//    }
}
