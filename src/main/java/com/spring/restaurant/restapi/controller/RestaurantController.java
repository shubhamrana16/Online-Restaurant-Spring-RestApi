package com.spring.restaurant.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RestaurantController {
	
	
	@GetMapping
	public String testApi() {
		return "This is testing purpose";
	}

}
