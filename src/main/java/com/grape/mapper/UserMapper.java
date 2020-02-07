package com.grape.mapper;


import com.grape.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author RuntimeException
 */
@Repository
@Mapper
public interface UserMapper {

    User selectByUserName(String username);
}
