package com.daikichipathvariable.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DaikachiController {

	@RequestMapping("/daikichi/travel/{city}")
	public String homewithpath(@PathVariable("city") String city) {
		return "Congratulations! You will soon travel to" + city + "!";
	}

	@RequestMapping("/daikichi/lotto/{number}")
	public String lotto(@PathVariable("number") int number) {
		
		String msg="";
		if (number%2 == 0) {
			msg= "You will take a grand journey in the near future, but be weary of tempting offers";
		}
		if(number%2 !=0)
		{
			msg="You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
		
		return msg;
	}

	@RequestMapping("/daikichi")
	public String home() {
		return "Welcome!";
	}

	@RequestMapping("/")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}

	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas";
	}
}