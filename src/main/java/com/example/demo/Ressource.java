package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ressource {
	
	@GetMapping("/toto")
	public String toto() {
		return "Hello World";
	}

}
