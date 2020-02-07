package com.grape.service.impl;

import com.grape.domain.User;
import com.grape.mapper.UserMapper;
import com.grape.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author RuntimeException
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public User getUserByUsername(String username) {
        return userMapper.selectByUserName(username);
    }
}
