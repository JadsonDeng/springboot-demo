package com.jadson.study.web;

import com.jadson.study.config.ConfigPerson;
import com.jadson.study.domain.User;
import com.jadson.study.mapper.UserMapper;
import com.jadson.study.utils.ICoreException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

    @Autowired
    private ConfigPerson configPerson;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView hello() {
        try{
//            int a= 1/0;
        }catch (Exception e){
            throw new ICoreException(HttpStatus.INTERNAL_SERVER_ERROR.value(),"server error");
        }
        User user = userMapper.selectById(1);
        System.out.println(user);
        ModelAndView mav = new ModelAndView("/study");
        mav.addObject("user", user);
        return mav;
    }
}
