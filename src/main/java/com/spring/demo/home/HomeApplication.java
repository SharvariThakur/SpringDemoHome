package com.spring.demo.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/home")
public class HomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeApplication.class, args);
	}
	@GetMapping("/info")
	public String getHome()
	{
		return "Hello";
	}

	@GetMapping("/details")
	public String getDetails()
	{
		return "Details";
	}

	@GetMapping("/welcome")
	public String getWelcome()
	{
		return "Welcome";
	}

}
