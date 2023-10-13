package com.logreg.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.HttpServerErrorException;

import com.logreg.models.Login;
import com.logreg.models.User;
import com.logreg.services.LogRegService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class RogLegController {

	@Autowired
	private LogRegService logregService;

	@GetMapping("/")
	public String LogReg(Model model) {
		
		model.addAttribute("register", new User());
		model.addAttribute("login", new Login());
		return "index.jsp";
	}

	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("register") User user, BindingResult result, Model model,
			HttpSession session) {
		User loggedUser = logregService.register(user, result);
		if (result.hasErrors()) {
			model.addAttribute("login", new Login());
			return "index.jsp";
		} else {
			session.setAttribute("user_id", loggedUser.getId());
			return "redirect:/dashboard";
		}
	}

	@GetMapping("/dashboard")
	public String dashboard(HttpSession session,Model model) {
		if((Long)session.getAttribute("user_id") == null)
		{
		 return "redirect:/";
		}
		User loggedUser =  logregService.findUser((Long)session.getAttribute("user_id"));
		model.addAttribute("loggedUser", loggedUser);
		
		return "dashboard.jsp";
	}

	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("login") Login user, BindingResult result, Model model,
			HttpSession session) {
		User loogedUser = logregService.login(user, result);
		if (result.hasErrors()) {
			model.addAttribute("register", new User());
			return "index.jsp";
		} else {
			session.setAttribute("user_id", loogedUser.getId());
			return "redirect:/dashboard";
		}
	}
	@GetMapping("/logout")
	public String logout(HttpSession session)
	{
		session.invalidate();
		return "redirect:/";
	}

}
