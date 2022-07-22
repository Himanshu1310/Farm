package com.himanshu.farm.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FarmController {
	@GetMapping("/home")
	public String helloController() {
		return "Welcome to farm of himanshu, Please sit";
	}

}
