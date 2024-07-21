package com.zomato.zadmins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class KubernetesPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubernetesPracticeApplication.class, args);
	}
	
	@GetMapping(value = {"/","/hello"})
	public String greet() {
		return "Welcome sushant ";
	}
	
	@GetMapping(value = {"/hi"})
	public String greetHi() {
		return "Deployment working fine";
	}
	

}
