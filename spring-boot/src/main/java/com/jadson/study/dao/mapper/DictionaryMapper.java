package com.jadson.study.dao.mapper;

import com.jadson.study.domain.database.Dictionary;
import com.jadson.study.domain.database.DictionaryExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DictionaryMapper {

    int countByExample(DictionaryExample example);

    int deleteByExample(DictionaryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dictionary record);

    int insertSelective(Dictionary record);

    List<Dictionary> selectByExample(DictionaryExample example);

    Dictionary selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dictionary record, @Param("example") DictionaryExample example);

    int updateByExample(@Param("record") Dictionary record, @Param("example") DictionaryExample example);

    int updateByPrimaryKeySelective(Dictionary record);

    int updateByPrimaryKey(Dictionary record);

    List<Dictionary> selectByExampleWithLimit(DictionaryExample example);
}