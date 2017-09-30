package com.jadson.study.dao.impl;

import com.jadson.study.dao.UserDao;
import com.jadson.study.domain.User;
import com.jadson.study.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * jadson
 * 2017/9/28
 */
@Component
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByid(Integer id) {
        return null;
    }
}
