package com.example.springbootcore;

import com.example.springbootcore.bean.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Slf4j
@SpringBootTest
class SpringBootCoreApplicationTests {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSource  dataSource;
    @Test
    void contextLoads() {
    }
    @Test
    public void  JDBCtemplateTest()
    {
        String s = jdbcTemplate.queryForObject("select name from employee where id= 1", String.class);

        System.out.println(s);
        log.info("DataSource"+dataSource.getClass());

    }

}
