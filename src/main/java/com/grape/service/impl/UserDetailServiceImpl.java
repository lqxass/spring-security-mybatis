package com.grape.service.impl;

import com.grape.domain.User;
import com.grape.service.UserDetailService;
import com.grape.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author RuntimeException
 */
@Service
public class UserDetailServiceImpl implements UserDetailService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (StringUtils.isEmpty(username)) {
            throw new UsernameNotFoundException("username is empty");
        } else {
            User user = userService.getUserByUsername(username);
            if (user == null) {
                throw new UsernameNotFoundException("username is empty");
            }
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            return new org.springframework.security.core.userdetails.User(user.getUsername(),
                    user.getPassword(), grantedAuthorities);
        }
    }
}


