package com.trendyol.codecase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeCaseApplication {

    public enum discountType {
        Rate,
        Amount
    }

    public static void main(String[] args)
    {
        SpringApplication.run(CodeCaseApplication.class, args);
    }

}
