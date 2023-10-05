package com.virtus.userservice.service;

import com.virtus.userservice.mapper.UserMapper;
import com.virtus.userservice.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUserById(long id){
        return userMapper.findUserById(id);
    }
}
