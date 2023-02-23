package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
	@GetMapping("/show")
	public String a()
	{
		return "Welcome to SpringBoot";
	}
	

}
