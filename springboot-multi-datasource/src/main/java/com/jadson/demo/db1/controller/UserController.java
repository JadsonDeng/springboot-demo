package com.jadson.demo.db1.controller;

import com.jadson.demo.db1.model.User;
import com.jadson.demo.db1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list")
    public List<User> list() {
        List<User> users = userService.selectList();
        System.out.println("controller:" + users);
        return users;
    }

}
