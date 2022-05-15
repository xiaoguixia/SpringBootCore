package com.example.springbootcore.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "pet")
@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class Pet {
    private String name;
    private Double weight;
}
