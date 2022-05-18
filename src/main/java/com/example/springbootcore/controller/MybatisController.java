package com.example.springbootcore.controller;

import com.example.springbootcore.bean.User;
import com.example.springbootcore.bean.User1;
import com.example.springbootcore.bean.User1Example;
import com.example.springbootcore.mapper.User1Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MybatisController {

    @Autowired
    User1Mapper user1Mapper;


    @RequestMapping("/user1")
    @ResponseBody
    public User1 getUser()
    {
        User1Example example = new User1Example();
        example.createCriteria().andIdEqualTo(1);
        List<User1> list = user1Mapper.selectByExample(example);
        return list.get(0);
    }
}
