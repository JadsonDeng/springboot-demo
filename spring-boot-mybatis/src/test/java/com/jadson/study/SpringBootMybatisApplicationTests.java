package com.jadson.study;

import com.jadson.study.dao.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jadson.study.dao.UserDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMybatisApplicationTests {
	
	@Autowired
	private UserDao userDao;
	@Autowired
	private UserMapper userMapper;

	@Test
	public void contextLoads() {
		System.out.println(userMapper.selectByExample(null));
	}

}
