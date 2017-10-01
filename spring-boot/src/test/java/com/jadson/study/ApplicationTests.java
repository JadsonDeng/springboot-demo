package com.jadson.study;

import com.jadson.study.dao.mapper.DictionaryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired(required = false)
    private DictionaryMapper dictionaryMapper;

    @Test
    public void contextLoads() {
        System.out.println(dictionaryMapper.selectByPrimaryKey(1));
    }

}
