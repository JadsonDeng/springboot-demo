package com.jadson.study.annotation;

import java.lang.annotation.*;

/**
 * 字典注解
 * @Author: dengjunzhen
 * @Date: 下午11:38 2017/10/30
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DictGroup {

    String group();
    boolean state() default true;
    String remark() default "";
    int ordering() default 0;
}
