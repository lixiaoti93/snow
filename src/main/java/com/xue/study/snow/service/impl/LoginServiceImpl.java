package com.xue.study.snow.service.impl;

import com.xue.study.snow.service.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public String login() {
        return "login.html";
    }

    @Override
    public String income() {
        return "income.html";
    }
}
