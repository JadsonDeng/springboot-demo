package com.jadson.study;

import com.jadson.study.dao.DictionaryDao;
import com.jadson.study.dao.mapper.DictionaryMapper;
import com.jadson.study.domain.database.DictionaryExample;
import org.junit.Test;
import org.junit.runner.RunWith;
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

    @Test
    public void contextLoads() {
        DictionaryExample example = new DictionaryExample();
        DictionaryExample.Criteria criteria = example.createCriteria();

        example.setDistinct(true);
        example.setOrderByClause("ordering desc");
        example.setLimitClause(0, 10);
        criteria.andIdEqualTo(1);
        System.out.println(dictionaryMapper.selectByExampleWithLimit(example).get(0));
    }

}
