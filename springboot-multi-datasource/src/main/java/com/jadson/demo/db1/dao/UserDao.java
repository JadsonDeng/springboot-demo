package com.jadson.demo.db1.dao;

import com.jadson.demo.db1.model.User;

import java.util.List;

public interface UserDao {

    List<User> selectList();

}
