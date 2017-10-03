package com.jadson.study.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jadson.study.dao.mapper.DictionaryMapper;
import com.jadson.study.domain.database.Dictionary;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DictionaryMapperTest {

	@Autowired(required = false)
	private DictionaryMapper dictionaryMapper;

	@Test
	public void selectByIdTest() {
		Dictionary dictionary = dictionaryMapper.selectByPrimaryKey(1);
		System.out.println(dictionary);
	}
}
