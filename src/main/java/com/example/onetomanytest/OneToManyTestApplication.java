package com.example.onetomanytest;

import com.example.onetomanytest.service.ICreateDatabase;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OneToManyTestApplication {
    private final ICreateDatabase iCreateDatabase;

    public OneToManyTestApplication(ICreateDatabase iCreateDatabase) {
        this.iCreateDatabase = iCreateDatabase;
    }

    public static void main(String[] args) {
        SpringApplication.run(OneToManyTestApplication.class, args);
    }
    @Bean
    public CommandLineRunner runner(){
        return args -> {
            iCreateDatabase.createDatabase();
        };
    }

}
