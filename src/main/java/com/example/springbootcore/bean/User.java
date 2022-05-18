package com.example.springbootcore.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    int id;
    int age;
    String email;
    String password;
    String userName;
    char sex;

    public User(String password, String userName) {
        this.password = password;
        this.userName = userName;
    }
}
