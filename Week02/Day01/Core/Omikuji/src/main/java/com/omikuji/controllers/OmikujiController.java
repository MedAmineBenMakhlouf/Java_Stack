package com.omikuji.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
public class OmikujiController {

	@RequestMapping("/omikuji")
	public String form() {
		return "index.jsp";
	}

	@RequestMapping(value="/sendForm",method=RequestMethod.POST)
	public String sendForm(RedirectAttributes flash, HttpSession session, @RequestParam(value = "number") int number,
			@RequestParam(value = "city") String city, @RequestParam(value = "person") String person,
			@RequestParam(value = "hobby") String hobby, @RequestParam(value = "living") String living,
			@RequestParam(value = "speach") String speach)
	
	{
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("living", living);
		session.setAttribute("speach", speach);
		if(number < 2 || number >25)
		{
			flash.addFlashAttribute("error", "the num ber must be between 2 and 25");
			return "redirect:/omikuji";
		}
		
		return "redirect:/showDetails";
	}
	
	
	@RequestMapping("/showDetails")
	public String display()
	{
		return "showDetails.jsp";
	}
	
}
