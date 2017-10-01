package com.jadson.study.utils;

import com.jadson.study.domain.database.Dictionary;

import java.util.List;

/**
 * jadson
 * 2017/9/30
 */
public abstract class BaseDaoImpl<S, T> implements BaseDao<S, T> {

    public abstract BaseMapper<S, T> getBaseMapper();

    @Override
    public int countByExample(T example) {
        return getBaseMapper().countByExample(example);
    }

    @Override
    public int deleteByExample(T example) {
        return getBaseMapper().deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return getBaseMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int insert(S record) {
        return getBaseMapper().insert(record);
    }

    @Override
    public int insertSelective(S record) {
        return getBaseMapper().insert(record);
    }

    @Override
    public List<S> selectByExample(T example) {
        return getBaseMapper().selectByExample(example);
    }

    @Override
    public Dictionary selectByPrimaryKey(Integer id) {
        return getBaseMapper().selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(S record, T example) {
        return getBaseMapper().updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(S record, T example) {
        return getBaseMapper().updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(S record) {
        return getBaseMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(S record) {
        return getBaseMapper().updateByPrimaryKey(record);
    }

    @Override
    public List<S> selectByExampleWithLimit(T example) {
        return getBaseMapper().selectByExampleWithLimit(example);
    }
}

