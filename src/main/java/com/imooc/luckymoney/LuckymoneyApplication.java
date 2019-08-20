package com.imooc.luckymoney;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class LuckymoneyApplication {

    public static void main(String[] args) {
        SpringApplication.run(LuckymoneyApplication.class, args);
    }

}
