package com.jadson.study.annotation;

import java.lang.annotation.*;

/**
 * @Author: dengjunzhen
 * @Date: 下午11:42 2017/10/30
 **/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DictItem {

    String name();
    String value();
    String remark() default "";
    int ordering() default 0;
    boolean state() default true;

}
