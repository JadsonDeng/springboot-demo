package com.jadson.demo.db1.controller;

import com.jadson.demo.db1.model.User;
import com.jadson.demo.db1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private ReloadableResourceBundleMessageSource messageSource;

    @RequestMapping(value = "/list")
    public List<User> list() {
        List<User> users = userService.selectList();
        System.out.println("controller:" + users+" "+messageSource.getMessage("message.001", null, Locale.SIMPLIFIED_CHINESE));
        System.out.println("controller:" + users+" "+messageSource.getMessage("message.001", null, Locale.ENGLISH));
        System.out.println("controller:" + users+" "+messageSource.getMessage("message.001", null, null));
        return users;
    }

}
