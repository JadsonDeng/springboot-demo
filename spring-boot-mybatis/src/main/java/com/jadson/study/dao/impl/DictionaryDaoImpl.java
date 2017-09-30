package com.jadson.study.dao.impl;

import com.jadson.study.dao.DictionaryDao;
import com.jadson.study.dao.mapper.DictionaryMapper;
import com.jadson.study.domain.database.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * jadson
 * 2017/9/30
 */
@Repository
public class DictionaryDaoImpl implements DictionaryDao {

    @Autowired(required = false)
    private DictionaryMapper dictionaryMapper;

    @Override
    public Dictionary queryOneById(Integer id) {
        if (id == null) {
            return null;
        }
        return dictionaryMapper.selectByPrimaryKey(id);
    }
}
