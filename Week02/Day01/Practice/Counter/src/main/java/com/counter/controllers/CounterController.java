package com.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@Controller
public class CounterController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		int count = 0;
		if (session.getAttribute("count") == null) {
			// Use setAttribute to initialize the count in session
			session.setAttribute("count", 0);
		} else {
			// increment the count by 1 using getAttribute and setAttribute
			count = (Integer) session.getAttribute("count");
			count++;
			session.setAttribute("count", count);
		}
		return "counter.jsp";
	}

	@RequestMapping("/incr2")
	public String IncreaseBy2(HttpSession session) {
		int count2 = 0;
		if (session.getAttribute("count2") == null) {
			// Use setAttribute to initialize the count in session
			session.setAttribute("count2", 0);
		} else {
			// increment the count by 1 using getAttribute and setAttribute
			count2 = (Integer) session.getAttribute("count2");
			count2 += 2;
			session.setAttribute("count2", count2);
		}
		return "counter2.jsp";
	}

	@RequestMapping("/desc")
	public String reset(HttpSession session) {
		session.setAttribute("count", 0);
		session.setAttribute("count2", 0);
		return "counter.jsp";
	}
}
