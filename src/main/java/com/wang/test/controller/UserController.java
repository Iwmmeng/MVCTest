package com.wang.test.controller;

import com.wang.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "all",produces = "application/json; charset=UTF-8")
    @ResponseBody
    public Object getAllUsers(){
        return userService.selectAll();
    }
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
