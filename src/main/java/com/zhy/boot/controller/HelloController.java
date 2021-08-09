package com.zhy.boot.controller;

import ch.qos.logback.core.db.DBHelper;
import com.zhy.boot.bean.User;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handle01(@RequestBody String name){
        return "Hello,Spring boot 2"+name;
    }
}
