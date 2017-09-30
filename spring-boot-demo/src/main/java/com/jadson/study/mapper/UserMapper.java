package com.jadson.study.mapper;

import com.jadson.study.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User selectById(Integer id);
}
