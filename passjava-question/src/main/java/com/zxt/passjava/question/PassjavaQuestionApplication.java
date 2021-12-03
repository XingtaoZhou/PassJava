package com.zxt.passjava.question;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.zxt.passjava.question.dao")
@SpringBootApplication
public class PassjavaQuestionApplication {
    public static void main(String[] args) {
        SpringApplication.run(PassjavaQuestionApplication.class, args);
    }
}

