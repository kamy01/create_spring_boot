package com.example.create;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CreateApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(CreateApplication.class, args);
        System.out.println("Hello, the application started");

    }

}
