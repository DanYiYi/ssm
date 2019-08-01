package com.example.danyi.service;

import com.example.danyi.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface TestService {
    public User selectUser(String username,String password);
}
