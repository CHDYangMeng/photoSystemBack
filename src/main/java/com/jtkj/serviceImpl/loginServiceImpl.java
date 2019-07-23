package com.jtkj.serviceImpl;

import com.jtkj.mapper.LoginMapper;
import com.jtkj.mode.LoginResult;
import com.jtkj.mode.User;
import com.jtkj.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginServiceImpl implements loginService {

    @Autowired
    private LoginMapper loginMapper;

    private LoginResult loginResult;

    @Override
    public LoginResult login( String account, String password) throws Exception {

        User user = loginMapper.login(account, password);

        if (user != null) {
            loginResult = new LoginResult("登录成功",200);
        } else {
            loginResult = new LoginResult("密码错误",201);
        }
        return loginResult;
    }
}
