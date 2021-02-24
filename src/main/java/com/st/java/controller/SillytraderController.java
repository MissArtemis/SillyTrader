package com.st.java.controller;

import com.st.java.model.RegisterForm;
import com.st.java.model.RegisterResult;
import com.st.java.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@Slf4j
@RestController
@RequestMapping(value = "/sillytrader")
public class SillytraderController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/register")
    public RegisterResult register(@RequestBody RegisterForm form) {
        return userService.register(form);
    }

    @GetMapping("/hello")
    public String hello(){
        log.info("Success login in Spring boot app");
        return "Hello ZJH!!!";
    }


}
