package com.jadson.study.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * jadson
 * 2017/10/1
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DictionaryServiceImplTest {

    @Autowired
    private DictionaryService dictionaryService;

    @Test
    public void queryTest() {
        System.out.println(dictionaryService.queryOneById(null));
    }

}
