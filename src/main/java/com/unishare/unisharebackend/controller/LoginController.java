package com.unishare.unisharebackend.controller;

import org.springframework.web.bind.annotation.RestController;

import com.unishare.unisharebackend.dto.UserLoginDto;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class LoginController {
    String[] userData = { "Yohannes", "123abc" };
    
    @PostMapping("login/")
    public boolean getMethodName(@RequestBody UserLoginDto userLoginDto) {
        System.out.println(userLoginDto);
        return (userLoginDto.getUsername().equals(userData[0]) && userLoginDto.getPassword().equals(userData[1]));
    }

    /* implement Get using 
     * path variable
     * using request param
     */
    
}
