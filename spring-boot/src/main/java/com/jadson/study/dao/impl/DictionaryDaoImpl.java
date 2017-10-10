package com.jadson.study.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jadson.study.dao.DictionaryDao;
import com.jadson.study.dao.mapper.DictionaryMapper;
import com.jadson.study.domain.database.Dictionary;
import com.jadson.study.domain.database.DictionaryExample;
import com.jadson.study.utils.BaseDaoImpl;
import com.jadson.study.utils.BaseMapper;

/**
 * jadson 2017/9/30
 */
@Repository
public class DictionaryDaoImpl extends BaseDaoImpl<Dictionary, DictionaryExample> implements DictionaryDao {

	@Autowired(required = false)
	private DictionaryMapper dictionaryMapper;

	@Override
	public BaseMapper<Dictionary, DictionaryExample> getBaseMapper() {
		return this.dictionaryMapper;
	}
}
