package com.jadson.study.utils;

import com.jadson.study.annotation.DictGroup;
import com.jadson.study.annotation.DictItem;
import com.jadson.study.constant.DictTypeEnum;
import com.jadson.study.dao.mapper.SysDictionaryMapper;
import com.jadson.study.dictionary.DictionaryRegister;
import com.jadson.study.domain.database.SysDictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: dengjunzhen
 * @Date: 下午11:50 2017/10/30
 **/
@Component
public class DictionaryUtils {

    @Autowired(required = false)
    private SysDictionaryMapper sysDictionaryMapper;

    public void init() throws NoSuchFieldException {
        List<Class> classes = DictionaryRegister.getDictionaries();
        for (Class item : classes) {
            boolean isDictGroup = item.isAnnotationPresent(DictGroup.class);
            if (!isDictGroup) {
                continue;
            }
            DictGroup dictGroup = (DictGroup) item.getAnnotation(DictGroup.class);
            String group = dictGroup.group();
            boolean state = dictGroup.state();
            String remark = dictGroup.remark();
            int ordering = dictGroup.ordering();
            System.out.println();
            SysDictionary dictionary = new SysDictionary();
            dictionary.setDicGroup(group);
            dictionary.setOrdering(ordering);
            dictionary.setRemark(remark);
            dictionary.setState(state);
            dictionary.setType(DictTypeEnum.GROUP.name());
            sysDictionaryMapper.insert(dictionary);

            List<SysDictionary> list = new ArrayList<>();
            Field[] fields = item.getFields();
            for (Field field : fields) {
                boolean isDictItem = field.isAnnotationPresent(DictItem.class);
                if (!isDictItem) {
                    continue;
                }
                DictItem dictItem = field.getAnnotation(DictItem.class);
                SysDictionary dictionary1=new SysDictionary();
                dictionary1.setType(DictTypeEnum.ITEM.name());
                dictionary1.setState(dictItem.state());
                dictionary1.setRemark(dictItem.remark());
                dictionary1.setOrdering(dictItem.ordering());
                dictionary1.setDicName(dictItem.name());
                dictionary1.setDicValue(dictItem.value());
                dictionary1.setParentId(dictionary.getId());
                sysDictionaryMapper.insertSelective(dictionary1);
            }
        }
    }


}
