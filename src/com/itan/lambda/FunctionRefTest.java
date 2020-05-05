package com.itan.lambda;

import com.itan.pojo.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionRefTest {
//    @Test
//    public void test(){
//        print(System.out::println);
//    }
//    private void print(Consumer<String> consumer){
//        consumer.accept("HelloWorld");
//    }
    @Test
    public void test(){
        String userName=getUserName(User::getName);
        System.out.println(userName);
    }
    private String getUserName(Function<User,String> function){
        User user=new User();
        user.setName("张三");
        return function.apply(user);
    }

}
