package com.star.community.dao;

import com.star.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author Star
 * @Date 2022/5/21 18:22
 * @Version 1.0
 */
@Mapper
public interface UserMapper {
    User selectById(int id);
    User selectByName(String username);
    User selectByEmail(String email);
    int insertUser(User user);
    int updateStatus(int id,int status);
    int updateHeader(int id,String headerUrl);
    int updatePassword(int id,String password);
}
