package com.jadson.study.dao.impl;

import com.jadson.study.dao.mapper.UserMapper;
import com.jadson.study.domain.database.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jadson.study.dao.UserDao;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * jadson
 * 2017/9/29
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryOneById(Integer id) {
        return userMapper.selectByPrimaryKey(1);
    }
}
