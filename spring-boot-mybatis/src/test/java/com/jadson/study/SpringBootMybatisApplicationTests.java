package com.jadson.study;

import com.jadson.study.utils.DictionaryUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybatisApplicationTests {

	@Autowired
	private DictionaryUtils dictionaryUtils;

	@Test
	public void contextLoads() throws NoSuchFieldException {
		System.out.println("hello");
	}

}
