package com.example.springbootcore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Employee {
    private int id;
    private String name;
    private String email;
    private int age;
    private int did;
    private char sex;
}
