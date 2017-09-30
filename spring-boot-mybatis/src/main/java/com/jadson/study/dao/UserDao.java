package com.jadson.study.dao;

import com.jadson.study.domain.database.User;

public interface UserDao {
    User queryOneById(Integer id);
}
