package com.jadson.study;

import com.jadson.study.dao.DictionaryDao;
import com.jadson.study.service.DictionaryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jadson.study.dao.mapper.DictionaryMapper;
import com.jadson.study.domain.database.DictionaryExample;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired(required = false)
	private DictionaryMapper dictionaryMapper;
	@Autowired
	private DictionaryDao dictionaryDao;
	@Autowired
	private DictionaryService dictionaryService;

	@Test
	public void contextLoads() {
		DictionaryExample example = new DictionaryExample();
		DictionaryExample.Criteria criteria = example.createCriteria();
		criteria.andDicGroupLike("b%");
		System.out.println(dictionaryMapper.selectByExample(example));
		System.out.println(dictionaryDao.selectByPrimaryKey(1));
		dictionaryService.queryOneById(1);
	}

}
