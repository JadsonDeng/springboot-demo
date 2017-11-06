package com.jadson.study.dao;

import com.jadson.study.domain.database.SysDictionary;

/**
 * @Author: dengjunzhen
 * @Date: 下午11:35 2017/10/30
 **/
public interface SysDictionaryDao {
    int insert(SysDictionary record);
    SysDictionary queryOneById(Integer id);
}
