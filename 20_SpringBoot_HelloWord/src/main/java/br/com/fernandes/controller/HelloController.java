package br.com.fernandes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/teste")	
	public String testHello() {
		return "Minha primeira página com Spring Boot";
	}
	
}
