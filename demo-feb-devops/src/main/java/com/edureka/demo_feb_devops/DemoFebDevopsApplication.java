package com.edureka.demo_feb_devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@SpringBootApplication

public class DemoFebDevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFebDevopsApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return String.format("Hello there");
	}

}
