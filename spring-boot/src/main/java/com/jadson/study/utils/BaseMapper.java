package com.jadson.study.utils;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jadson.study.domain.database.Dictionary;

public interface BaseMapper<S, T> {

    int countByExample(T example);

    int deleteByExample(T example);

    int deleteByPrimaryKey(Integer id);

    int insert(S record);

    int insertSelective(S record);

    List<S> selectByExample(T example);

    Dictionary selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") S record, @Param("example") T example);

    int updateByExample(@Param("record") S record, @Param("example") T example);

    int updateByPrimaryKeySelective(S record);

    int updateByPrimaryKey(S record);

    List<S> selectByExampleWithLimit(T example);
}
