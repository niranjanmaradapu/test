package com.otsi.testdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestDemoApplication {

	public static void main(String[] args) {
		System.out.println("testing...");
		SpringApplication.run(TestDemoApplication.class, args);
	}

}
