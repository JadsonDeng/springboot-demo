package com.jadson.study.dao.mapper;

import com.jadson.study.domain.database.Dictionary;
import com.jadson.study.domain.database.DictionaryExample;
import com.jadson.study.utils.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

public interface DictionaryMapper extends BaseMapper<Dictionary, DictionaryExample> {
    
}