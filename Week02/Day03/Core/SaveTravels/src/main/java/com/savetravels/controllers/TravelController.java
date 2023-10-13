package com.savetravels.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.savetravels.models.Travel;
import com.savetravels.services.TravelService;

import jakarta.validation.Valid;

@Controller
public class TravelController {

	@Autowired
	private TravelService travelService;

	@GetMapping("/")
	public String index(@ModelAttribute("travel") Travel travel, Model model) {
		List<Travel> travels = travelService.findAll();
		model.addAttribute("travels", travels);
		return "index.jsp";
	}

	@PostMapping("/travels")
	public String create(@Valid @ModelAttribute("travel") Travel travel, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<Travel> travels = travelService.findAll();
			model.addAttribute("travels", travels);
			return "index.jsp";
		} else {
			travelService.createTravel(travel);
			return "redirect:/";
		}
	}
	
	@GetMapping("/expense/{id}")
	public String ShowOne(@PathVariable("id") Long id,Model model)
	{
		Travel travel = travelService.findOne(id);
		model.addAttribute("travel", travel);
		return "showOne.jsp";
	}
	
	@GetMapping("/expense/{id}/edit")
	public String edit(@PathVariable("id") Long id,Model model)
	{
		Travel travel = travelService.findOne(id);
		model.addAttribute("travel", travel);
		return "edit.jsp";
	}
	
	@PutMapping("/travels/{id}")
	public String update(@Valid @ModelAttribute("travel") Travel travel, BindingResult result)
	{
		if(result.hasErrors())
		{
			return "edit.jsp";
		}
		else
		{
			travelService.updateTravel(travel);
			return "redirect:/"; 
		}
	}
	
	@DeleteMapping("/travel/{id}/delete")
	public String deleteTravel(@PathVariable("id") Long id)
	{
		travelService.deleteTravel(id);
		return "redirect:/";
	}
}
