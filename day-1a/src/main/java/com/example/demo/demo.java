package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {
	@GetMapping("/show")
	public String sriram(@RequestParam String color)
	{
		return "My favourite color is "+color;
	}

}
