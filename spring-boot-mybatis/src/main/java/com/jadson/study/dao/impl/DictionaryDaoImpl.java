package com.jadson.study.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jadson.study.dao.DictionaryDao;
import com.jadson.study.dao.mapper.DictionaryMapper;
import com.jadson.study.domain.database.Dictionary;

/**
 * jadson 2017/9/30
 */
@Repository
public class DictionaryDaoImpl implements DictionaryDao {

	private static final Logger log = LoggerFactory.getLogger(DictionaryDaoImpl.class);

	@Autowired(required = false)
	private DictionaryMapper dictionaryMapper;

	@Override
	public Dictionary queryOneById(Integer id) {
		log.debug("select dictionary by id:{}", id);
		if (id == null) {
			return null;
		}
		return dictionaryMapper.selectByPrimaryKey(id);
	}
}
