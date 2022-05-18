package com.example.springbootcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan("com.example.Springbootcore")
@SpringBootApplication
public class SpringBootCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCoreApplication.class, args);
    }

}
