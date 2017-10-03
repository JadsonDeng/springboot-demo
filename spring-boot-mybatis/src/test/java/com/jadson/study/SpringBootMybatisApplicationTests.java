package com.jadson.study;

import com.jadson.study.dao.DictionaryDao;
import com.jadson.study.dao.mapper.DictionaryMapper;
import com.jadson.study.domain.database.DictionaryExample;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybatisApplicationTests {

    @Autowired
    private DictionaryDao dictionaryDao;
    @Autowired(required = false)
    private DictionaryMapper dictionaryMapper;
    Logger logger=LoggerFactory.getLogger(SpringBootMybatisApplicationTests.class);

    @Test
    public void testQuery() {
        DictionaryExample example = new DictionaryExample();
        DictionaryExample.Criteria criteria = example.createCriteria();

        example.setDistinct(true);
        example.setOrderByClause("ordering desc");
        example.setLimitClause(0, 10);
        criteria.andIdEqualTo(1);
        logger.debug("hehehehhhhhhhhhhhhhhhhhh");
        System.out.println(dictionaryMapper.selectByExampleWithLimit(example).get(0));
        System.out.println(dictionaryDao.queryOneById(1));
    }

}
