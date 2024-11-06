package com.pro3assignmentrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Pro3AssignmentRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(Pro3AssignmentRestApplication.class, args);
    }

}
