package com.jadson.study.dictionary;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: dengjunzhen
 * @Date: 下午11:51 2017/10/30
 **/
public class DictionaryRegister {

    public static List<Class> getDictionaries() {
        List<Class> dictionaries = new ArrayList<>();
        dictionaries.add(UserSex.class);
        return dictionaries;
    }
}
