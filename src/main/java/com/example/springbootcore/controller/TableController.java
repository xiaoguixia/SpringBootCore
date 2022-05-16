package com.example.springbootcore.controller;

import com.example.springbootcore.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class TableController {

    @GetMapping("/basic_table")
    public String basic_table()
    {
        return"table/basic_table";
    }
    @GetMapping("/dynamic_table")
    public String dynamic_table(Model model){
        List<User> list= Arrays.asList(new User("hx","123456"),
                new User("xl","123456"),
                new User("cpg","123456"),
                new User("zw","123456"));
        model.addAttribute("userList",list);
        return"table/dynamic_table";
    }
    @GetMapping("/editable_table")
    public String editable_table(){
        return"table/editable_table";
    }
    @GetMapping("/pricing_table")
    public String pricing_table()
    {
        return"table/pricing_table";
    }
    @GetMapping("/responsive_table")
    public String responsive_table(){
        return"table/responsive_table";
    }

}
