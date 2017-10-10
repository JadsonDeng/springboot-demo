package com.jadson.study.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jadson.study.dao.mapper.DictionaryMapper;
import com.jadson.study.domain.database.Dictionary;
import com.jadson.study.domain.database.DictionaryExample;

@Controller
public class HelloController {

	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@Autowired(required = false)
	private DictionaryMapper dictionaryMapper;

	@RequestMapping("/hello")
	public String sayHello(ModelMap map) {
		DictionaryExample example = new DictionaryExample();
		DictionaryExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(1);
		List<Dictionary> dictionaryList = dictionaryMapper.selectByExample(example);
		logger.debug("查询结果：{}", dictionaryList.get(0));
		map.put("dictionary", dictionaryList.get(0));
		return "/hello";
	}

}
