package com.jtkj.controller.login;

import com.jtkj.mode.LoginResult;
import com.jtkj.service.loginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@CrossOrigin
public class loginController {

    @Autowired
    private loginService loginService;

    @RequestMapping("/login-check")
    @ResponseBody
    public Map<String, Object> login_result( @RequestParam("account") String account, @RequestParam("password") String password) throws Exception {

        LoginResult loginResult = loginService.login(account, password);

        Map<String,Object> result = new HashMap<String,Object>();
        if (loginResult.getCode() == 200) {
            System.out.println("登录成功");
            result.put("status", 200);
            result.put("message","访问成功");
            result.put("account",account);
        } else {
            System.out.println("登录失败");
            result.put("status", 201);
            result.put("message","访问失败");
            result.put("account",account);
        }
        return result;
    }
}
