package com.rishab.webclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableDiscoveryClient
public class WebClientApplication implements WebMvcConfigurer {
	
	public WebClientApplication() {
		System.out.println("***************WebClientApplication*****************");
	}

	public static final String ACCOUNT_SERVICE_URL = "http://AccountService";
	
	public static final String USER_SERVICE_URL = "http://UserService";
	
	public static void main(String[] args) {
		SpringApplication.run(WebClientApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public AccountRepository accountRepository() {
		return new RemoteAccountRepository(ACCOUNT_SERVICE_URL);
	}
	
	@Bean
	public UserRepository userRepository() {
		return new RemoteUserRepository(USER_SERVICE_URL);
	}

}
