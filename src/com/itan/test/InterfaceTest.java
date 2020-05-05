package com.itan.test;

import com.itan.pojo.User;
import com.itan.service.UserService;
import com.itan.service.impl.UserServiceImpl;
import org.junit.Test;

public class InterfaceTest {
    @Test
    public void testInterfaceDefault(){
        UserService userService=new UserServiceImpl();
        User user=userService.getUser();
        System.out.println(user);
    }
}
