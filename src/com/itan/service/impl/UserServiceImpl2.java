package com.itan.service.impl;

import com.itan.data.UserData;
import com.itan.pojo.User;
import com.itan.service.UserService;

import java.util.List;

public class UserServiceImpl2 implements UserService {
    @Override
    public void save(User user) {
        UserData.list.add(user);
    }

    @Override
    public User findById(Integer id) {
        return null;
    }
}
