package com.jadson.study.service.impl;

import com.jadson.study.dao.SysDictionaryDao;
import com.jadson.study.domain.database.SysDictionary;
import com.jadson.study.service.SysDictionaryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Service;

/**
 * @Author: dengjunzhen
 * @Date: 上午9:18 2017/11/2
 **/
@Service
public class SysDictionaryServiceImpl implements SysDictionaryService, SmartLifecycle {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private SysDictionaryDao sysDictionaryDao;

    @Override
    public SysDictionary queryOneById(Integer id) {
        return sysDictionaryDao.queryOneById(id);
    }

    @Override
    public boolean isAutoStartup() {
        return false;
    }

    @Override
    public void stop(Runnable runnable) {
        logger.debug("===> service in stop(Runnable)");
    }

    @Override
    public void start() {
        logger.debug("===> service in start()");
    }

    @Override
    public void stop() {
        logger.debug("===> service in stop()");
    }

    @Override
    public boolean isRunning() {
        logger.debug("===> service in isRunning()");
        return false;
    }

    @Override
    public int getPhase() {
        return 1;
    }
}
