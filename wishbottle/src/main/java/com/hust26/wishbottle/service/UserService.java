package com.hust26.wishbottle.service;


import com.hust26.wishbottle.entity.User;

import java.util.List;

public interface UserService {
    // 添加新用户
    public User addUser(User user);

    // 修改用户信息
    public User alterUser(User user);

    public List findAllUser();



}
