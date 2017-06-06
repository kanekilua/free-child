package com.bigplayer;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by KILUA on 2017/2/28.
 */
@SpringBootApplication
@MapperScan(basePackages = "com.protal.das.dao")
public class Application {
    public static void main(String args[]){
        SpringApplication.run(Application.class, args);
    }
}
