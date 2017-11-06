package com.jadson.study.constant;

/**
 * @Author: dengjunzhen
 * @Date: 下午11:37 2017/10/30
 **/
public enum DictTypeEnum {
    GROUP("group"),
    ITEM("item");

    String name;
    DictTypeEnum(String name){
        this.name = name;
    }
}
