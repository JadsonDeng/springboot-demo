package com.jadson.study.dao.mapper;

import com.jadson.study.domain.database.Dictionary;
import com.jadson.study.domain.database.DictionaryExample;

import java.util.List;

import com.jadson.study.utils.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface DictionaryMapper extends BaseMapper<Dictionary, DictionaryExample> {
    
}