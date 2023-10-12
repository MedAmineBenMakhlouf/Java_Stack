package com.lookify.Controllers;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.lookify.Services.LookifyService;
import com.lookify.models.Lookify;

import jakarta.validation.Valid;

@Controller
public class LookifyController {

	@Autowired
	private LookifyService lookifyService;

	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}

	@GetMapping("/dashboard")
	public String dashboard(Model model) {

		List<Lookify> lookifies = lookifyService.getAll();
		model.addAttribute("lookifies", lookifies);
		return "dashboard.jsp";
	}

	@GetMapping("/lookify/new")
	public String index(@ModelAttribute("lookify") Lookify lookify, Model model) {
		return "addLookify.jsp";
	}

	@PostMapping("/lookify")
	public String addLookify(@Valid @ModelAttribute("lookify") Lookify lookify, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "addLookify.jsp";
		} else {
			Lookify looki = lookifyService.createLookify(lookify);
			return "redirect:/dashboard";
		}
	}

	@GetMapping("/lookify/findTop")
	public String findTop(Model model) {
		List<Lookify> lookifys = lookifyService.getTop10();
		model.addAttribute("lookifys", lookifys);
		return "top10.jsp";

	}

	@GetMapping("/findByName")
	public String finByName(@RequestParam("name") String name, Model model) {
		List<Lookify> lookify = lookifyService.findByName(name);
		model.addAttribute("lookify", lookify);
		return "artist.jsp";
	}

	@GetMapping("/lookify/{id}")
	public String findOne(@PathVariable("id") Long id, Model model) {
		Lookify lookify = lookifyService.findOne(id);
		model.addAttribute("lookify", lookify);
		return "oneArtist.jsp";
	}

	@GetMapping("/lookify/{id}/edit")
	public String findOneAndUpdate(@PathVariable("id") Long id, Model model) {
		Lookify lookify = lookifyService.findOne(id);
		model.addAttribute("lookify", lookify);
		return "edit.jsp";
	}

	@PutMapping("/update")
	public String update(@Valid @ModelAttribute("lookify") Lookify lookify, BindingResult result, Model model) {

		if (result.hasErrors()) {
			return "edit.jsp";
		} else {
			lookifyService.updateLookify(lookify);
			return "redirect:/dashboard";
		}
	}
	
	@DeleteMapping("/lookify/{id}/delete")
	public String deletlookify(@PathVariable("id") Long id)
	{
		lookifyService.deleteLookify(id);
		return "redirect:/dashboard";
	}

}
