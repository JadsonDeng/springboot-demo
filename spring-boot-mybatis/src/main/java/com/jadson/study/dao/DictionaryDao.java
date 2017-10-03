package com.jadson.study.dao;

import com.jadson.study.domain.database.Dictionary;

public interface DictionaryDao {
        Dictionary queryOneById(Integer id);
}
