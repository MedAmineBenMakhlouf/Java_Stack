package com.springhuman.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {

	@RequestMapping("/")
	public String withname(@RequestParam(value = "name", defaultValue = "Human") String query,
			@RequestParam(value = "lastname", defaultValue = "") String last,
			@RequestParam(value = "times", defaultValue = "1") int times) {
		String result =" ";
		for (var i = 0; i <= times;i++) {
			result+= "Hello " + query + " " + last+"<br/>";
		}return result;
	}
}
