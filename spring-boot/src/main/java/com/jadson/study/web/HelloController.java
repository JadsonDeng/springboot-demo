package com.jadson.study.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.jadson.study.service.DictionaryService;

@Controller
public class HelloController {
	
	@Autowired
	private DictionaryService dictionaryService;

	@GetMapping("/hello")
	public String hello(Map<String, String> map) {
		System.out.println(dictionaryService.queryOneById(1));
		return "hello";
	}
}
