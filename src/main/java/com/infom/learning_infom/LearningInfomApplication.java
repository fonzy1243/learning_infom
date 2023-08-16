package com.infom.learning_infom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LearningInfomApplication {

	public static void main(String[] args) {
		// Hello!
		SpringApplication.run(LearningInfomApplication.class, args);
	}

	@GetMapping
	public String greet() {
		return "Hello world!";
	}

}
