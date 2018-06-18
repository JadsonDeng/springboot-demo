package com.jadson.demo.db1.service;

import com.jadson.demo.db1.dao.UserDao;
import com.jadson.demo.db1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> selectList() {
        return userDao.selectList();
    }

}
