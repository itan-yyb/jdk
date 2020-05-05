package com.itan.service.impl;

import com.itan.data.UserData;
import com.itan.pojo.User;
import com.itan.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public void save(User user) {
    }

    @Override
    public User findById(Integer id) {
        List<User> list = UserData.list;
        for (User user : list) {
            if (user.getId().equals(id)){
                return user;
            }
        }
        return null;
    }
}
