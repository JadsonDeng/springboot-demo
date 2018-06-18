package com.jadson.demo.db1.dao.impl;

import com.jadson.demo.db1.dao.UserDao;
import com.jadson.demo.db1.mapper.UserMapper;
import com.jadson.demo.db1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectList() {
        return userMapper.selectList();
    }
}
