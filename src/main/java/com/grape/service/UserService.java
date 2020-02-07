package com.grape.service;

import com.grape.domain.User;

/**
 * @author RuntimeException
 */
public interface UserService {


    User getUserByUsername(String username);
}
