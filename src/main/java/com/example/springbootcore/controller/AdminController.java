package com.example.springbootcore.controller;

import com.example.springbootcore.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class AdminController {

    @GetMapping({"/", "/login"})
    public String login() {
        return "login";

    }


    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model) {
        if (!user.getUserName().isEmpty() && user.getPassword().equals("123456")) {
            session.setAttribute("user", user);
            return "redirect:/index.html";
        } else {
            model.addAttribute("msg", "账号密码错误");
            return "login";
        }

    }


    @GetMapping("/index.html")
    public String indexPage(HttpSession session) {
        Object user = session.getAttribute("user");
        if (user != null) {
            return "index";
        } else {
            return "login";
        }
    }

    @GetMapping("/index")
    public String indexPageOne(HttpSession session) {
        Object user = session.getAttribute("user");
        if (user != null) {
            return "index";
        }
        else
        {
            return "login";
        }
    }
}


