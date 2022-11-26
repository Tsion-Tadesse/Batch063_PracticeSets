package com.practicepart2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeJdbcApplication.class, args);
		System.out.println("Test");
	}

}
