package com.hust26.wishbottle.service.serviceImpl;

import com.hust26.wishbottle.entity.User;
import com.hust26.wishbottle.repository.UserRepository;
import com.hust26.wishbottle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User alterUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List findAllUser() {
        return userRepository.findAll();
    }


}
