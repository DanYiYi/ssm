package com.example.danyi.service.impl;

import com.example.danyi.entity.User;
import com.example.danyi.mapper.TestMapper;
import com.example.danyi.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;
    @Override
    public User selectUser(String username,String password) {
        return testMapper.selectUser(username,password);
    }
}
