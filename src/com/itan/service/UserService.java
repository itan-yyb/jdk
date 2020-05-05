package com.itan.service;

import com.itan.pojo.User;

public interface UserService {
    /**
     * 保存
     * @param user
     */
    void save(User user);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    User findById(Integer id);

    /**
     * 获取user，从 java8 开始，接口中允许定义 default 默认方法
     * @return
     */
    default User getUser(){
        return new User();
    }

    /**
     * 从java8开始，接口中允许定义静态方法，与一般类的静态方法用法相同
     * @return
     */
    static User getUser1(){
        return new User();
    }
}
