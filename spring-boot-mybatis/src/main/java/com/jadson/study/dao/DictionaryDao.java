package com.jadson.study.dao;

import com.jadson.study.domain.database.Dictionary;
import com.jadson.study.domain.database.DictionaryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DictionaryDao {
        Dictionary queryOneById(Integer id);
}
