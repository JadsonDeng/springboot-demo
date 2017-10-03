package com.jadson.study.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jadson.study.dao.DictionaryDao;
import com.jadson.study.domain.database.Dictionary;
import com.jadson.study.service.DictionaryService;

/**
 * jadson
 * 2017/10/1
 */
@Service
public class DictionaryServiceImpl implements DictionaryService {

    private static final Logger logger = LoggerFactory.getLogger(DictionaryServiceImpl.class);

    @Autowired
    private DictionaryDao dictionaryDao;

    @Override
    public Dictionary queryOneById(Integer id) {
        logger.debug("==> queryOneById:{} ", id);
        if (id == null) {
            logger.error("==> queryById, id is null,return null");
            return null;
        }
        Dictionary dictionary = dictionaryDao.selectByPrimaryKey(id);
        logger.debug("==> queryOneById result:{}", dictionary);
        return dictionary;
    }
}
