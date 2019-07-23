package com.jtkj.controller.success;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class successController {

    @RequestMapping("/success")
    public String success() throws Exception {
        return "success";
    }
}
