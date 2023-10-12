package com.dojosninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojosninjas.models.Dojo;
import com.dojosninjas.services.DojoService;

import jakarta.validation.Valid;

@Controller
public class DojoController {

	@Autowired
	private DojoService dojoService;
	@GetMapping("/")
	public String createDojo(@ModelAttribute("dojo") Dojo dojo)
	{
		return "createDojo.jsp";
	}
	
	@PostMapping("/dojo")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model model)
	{
		if (result.hasErrors()) {
			return "createDojo.jsp";
		} else {
			dojoService.createDojo(dojo);
			return "redirect:/ninja/create";
		}
	}
}
