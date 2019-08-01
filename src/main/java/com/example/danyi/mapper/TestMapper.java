package com.example.danyi.mapper;

import com.example.danyi.entity.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface TestMapper {

    /**
     * 检验是否登录
     * @param username
     * @param password
     * @return
     */
    public User selectUser(String username,String password);
}
