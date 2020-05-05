package com.itan.lambda;

import com.itan.pojo.User;
import org.junit.Test;
import java.util.function.Supplier;

public class SupplierTest {
    private static User getUser(Supplier<User> supplier){
        return supplier.get();
    }
    @Test
    public void getUser(){
        User user=getUser(()->new User());
        System.out.println(user);
    }

    @Test
    public void testGetMin(){
        int [] arr={1,2,55,88,44,0};
        int minNum=getMain(()->{
            //假设第一个是最小值
            int min=arr[0];
            for (int item:arr){
                if (item<min){
                    min=item;
                }
            }
            return min;
        });
        System.out.println(minNum);
    }

    private int getMain(Supplier<Integer> supplier){
        return supplier.get();
    }
}
