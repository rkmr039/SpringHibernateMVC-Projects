package com.rishab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class JdbcdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcdemoApplication.class, args);
	}

}
