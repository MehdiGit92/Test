package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);

        client client = new client();
        client.setId(2L);
        client.setName("Mehdi");
        System.out.println("Result : " + client.getId());


        
    }

}
