package com.omikuji.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OmikujiController {

	@RequestMapping("/omikuji")
	public String form() {
		return "index.jsp";
	}

	@RequestMapping("/sendForm")
	public String sendForm(Model model, @RequestParam(value = "number") int number,
			@RequestParam(value = "city") String city, @RequestParam(value = "person") String person,
			@RequestParam(value = "hobby") String hobby, @RequestParam(value = "living") String living,
			@RequestParam(value = "speach") String speach)
	
	{
		model.addAttribute("number", number);
		model.addAttribute("city", city);
		model.addAttribute("person", person);
		model.addAttribute("hobby", hobby);
		model.addAttribute("living", living);
		model.addAttribute("speach", speach);
		
		return "showDetails.jsp";
	}

}
