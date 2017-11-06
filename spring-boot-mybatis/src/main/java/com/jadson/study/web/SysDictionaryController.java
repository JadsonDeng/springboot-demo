package com.jadson.study.web;

import com.jadson.study.domain.database.SysDictionary;
import com.jadson.study.service.SysDictionaryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: dengjunzhen
 * @Date: 上午9:37 2017/11/2
 **/
@RestController
@RequestMapping("/dic")
public class SysDictionaryController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private SysDictionaryService sysDictionaryService;

    @GetMapping(value = "/query/{id}")
    public SysDictionary view(@PathVariable("id") Integer id){
        SysDictionary sysDictionary = sysDictionaryService.queryOneById(id);
        logger.debug("===> query result: {}", sysDictionary);
        return sysDictionary;
    }
}
