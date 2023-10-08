package com.omikuji.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class OmikujiController {

	@RequestMapping("/omikuji")
	public String form() {
		return "index.jsp";
	}

	@RequestMapping("/sendForm")
	public String sendForm(HttpSession session, @RequestParam(value = "number") int number,
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
		
		return "showDetails.jsp";
	}

}
