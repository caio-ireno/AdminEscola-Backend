package com.admin.escola.infrastructure;


import com.admin.escola.infrastructure.configuration.WebServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        SpringApplication.run(WebServerConfig.class, args);

    }
}