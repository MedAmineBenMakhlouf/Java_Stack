package com.dojosninjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojosninjas.models.Dojo;
import com.dojosninjas.models.Ninja;
import com.dojosninjas.services.DojoService;
import com.dojosninjas.services.NinjaService;

import jakarta.validation.Valid;

@Controller
public class NinjaController {
	
	@Autowired
	private NinjaService ninjaService;
	@Autowired
	private DojoService dojoService;
	
	@GetMapping("/ninja/create")
	public String index(@ModelAttribute("ninja") Ninja dojo, Model model)
	{
		List<Dojo> dojos = dojoService.getAll();
		model.addAttribute("dojos",dojos);
		return "createNinja.jsp";
	}
	
	@PostMapping("/createNinja")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model)
	{
		if (result.hasErrors()) {
			return "createNinja.jsp";
		} else {
			Ninja thisninja = ninjaService.createNinja(ninja);
			String redirectTo = "redirect:/dojo/" + thisninja.getDojo().getId();
			return redirectTo;
		}
	}
	
	@GetMapping("/dojo/{id}")
	public String dashboard(@PathVariable("id") Long id,Model model)
	{
		Dojo dojo = dojoService.findOne(id);
		model.addAttribute("dojo",dojo);
		return "dashboard.jsp";
	}
	
}
