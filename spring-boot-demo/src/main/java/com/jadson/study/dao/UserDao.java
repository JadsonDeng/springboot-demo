package com.jadson.study.dao;

import com.jadson.study.domain.User;

/**
 * jadson
 * 2017/9/28
 */
public interface UserDao {
    public User selectByid(Integer id);
}
