package com.firstapp.helloapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloappApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloappApplication.class, args);
	}

	@GetMapping
	public String index() {
		return "Hello Spring Azure";
	}

	@GetMapping("/about")
	public String about() {
		return "We are at Azure";
	}

	@GetMapping("/privacy")
	public String privacy() {
		return "We are at Azure - Privacy Page";
	}

}
