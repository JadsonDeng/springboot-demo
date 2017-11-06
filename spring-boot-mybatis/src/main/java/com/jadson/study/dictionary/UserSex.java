package com.jadson.study.dictionary;

import com.jadson.study.annotation.DictGroup;
import com.jadson.study.annotation.DictItem;

/**
 * @Author: dengjunzhen
 * @Date: 下午11:45 2017/10/30
 **/
@DictGroup(group = "user_sex", remark = "用户性别",  ordering = 1)
public interface UserSex {

    @DictItem(name="男", value="1", remark = "男" , ordering = 1)
    String FEMALE = "1";

    @DictItem(name="女", value="2", remark = "女" , ordering = 2)
    String MALE = "2";


}
