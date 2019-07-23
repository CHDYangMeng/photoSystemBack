package com.jtkj.controller.setting;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class accountController {

    @RequestMapping("/account")
    public String account() throws Exception {
        return "setting/account";
    }
}
