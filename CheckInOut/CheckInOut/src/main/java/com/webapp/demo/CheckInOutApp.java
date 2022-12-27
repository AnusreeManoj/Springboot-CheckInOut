package com.webapp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class CheckInOutApp {

	public static void main(String[] args) {
		SpringApplication.run(CheckInOutApp.class, args);
	}

}