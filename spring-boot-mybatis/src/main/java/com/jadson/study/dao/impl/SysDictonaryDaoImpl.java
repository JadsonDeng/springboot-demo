package com.jadson.study.dao.impl;

import com.jadson.study.dao.SysDictionaryDao;
import com.jadson.study.dao.mapper.SysDictionaryMapper;
import com.jadson.study.domain.database.SysDictionary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * @Author: dengjunzhen
 * @Date: 下午11:35 2017/10/30
 **/
@Repository
public class SysDictonaryDaoImpl implements SysDictionaryDao, SmartLifecycle {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired(required = false)
    private SysDictionaryMapper sysDictionaryMapper;

    @Override
    public SysDictionary queryOneById(Integer id) {

        return sysDictionaryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insert(SysDictionary record) {
        return sysDictionaryMapper.insert(record);
    }

    @Override
    public boolean isAutoStartup() {
        return false;
    }

    @Override
    public void stop(Runnable runnable) {
        logger.debug("===> dao  in stop()");
    }

    @Override
    public void start() {
        logger.debug("===> dao in start()");
    }

    @Override
    public void stop() {
        logger.debug("===> dao  in stop()");
    }

    @Override
    public boolean isRunning() {
        return false;
    }

    @Override
    public int getPhase() {
        return -1;
    }
}
