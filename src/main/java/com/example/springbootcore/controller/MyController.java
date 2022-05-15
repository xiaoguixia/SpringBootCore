package com.example.springbootcore.controller;

import com.example.springbootcore.bean.Person;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.Cookie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MyController {
    @Autowired
    Person person;

    @RequestMapping("/person")
    public Person getPerson()
    {
        return person;
    }

//    @RequestBody只有post请求才有
    @GetMapping("/test/{id}/{username}")
    public void test(@PathVariable("id") String id, @PathVariable("username") String username,
                     @PathVariable Map<String, Object> map, @RequestParam("password") String password)
    {
        System.out.println(map);
        System.out.println(password);

    }

//    必须使用路劲变量
    @GetMapping("/MatrixTest/{address1}/{address2}")
    public  Map<String, Object> MatrixTest(@MatrixVariable(value = "username",pathVar = "address1")String username,
                                           @MatrixVariable(value = "password",pathVar = "address2")String password,
                                           @MatrixVariable Map<String,Object> map1
                                           )
    {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("username",username);
        map.put("password",password);
        map.put("map",map1);
        return map;

    }

    @GetMapping("/forward")
    public String forward(Model model)
    {

        model.addAttribute("msg","xixi");
        return "forward:/requestAttribute";
    }

    @ResponseBody
    @GetMapping("/requestAttribute")
    public Map<String, Object> testRequestAttribute(@RequestAttribute("msg") String msg){


        HashMap<String, Object> map = new HashMap<>();
        map.put("msg",msg);
        return map;
    }
}
