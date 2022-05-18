package com.example.springbootcore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @ResponseBody
    @GetMapping("/sql")
    public String test()
    {
        String s = jdbcTemplate.queryForObject("select name from employee where id= 1", String.class);
        System.out.println(s);
        return s;
    }
}
