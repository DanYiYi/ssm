package com.example.danyi.controller;


import com.example.danyi.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;


    @RequestMapping(value = "/selectUser",method = RequestMethod.POST)
    public String selectUser(String username,String password){
        if (testService.selectUser(username, password)!=null){
            return "/test/test";
        }
        return "login/login";
    }
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(String list,String texts){
        System.out.println(list+texts);
        return "/test/test";
    }

}
