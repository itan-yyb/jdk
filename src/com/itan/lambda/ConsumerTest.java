package com.itan.lambda;

import com.itan.pojo.User;
import org.junit.Test;

import java.util.function.Consumer;

public class ConsumerTest {
    @Test
    public void test(){
        User user=new User();
        setUserDefaultNameAndSex(u-> {
            u.setName("张三");
            System.out.println(u);
        },u->{
            u.setSex("男");
            System.out.println(u);
        },user);
        System.out.println(user);
    }
    private void setUser(Consumer<User> consumer,User user){
        consumer.accept(user);
    }
    private void setUserDefaultNameAndSex(Consumer<User> one,Consumer<User> two,User user){
        one.andThen(two).accept(user);
    }
}
