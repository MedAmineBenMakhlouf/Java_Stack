package com.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateContoller {
	
	@RequestMapping("/")
	public String index()
	{
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model)
	{
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMM dd, yyyy", Locale.getDefault());
		String formattedDate = sdf.format(date);
		String alert = "<script>alert('this is the date template')</script>";
		model.addAttribute("formattedDate", formattedDate);
		model.addAttribute("alert", alert);
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model)
	{
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm aaa", Locale.getDefault());
		String formattedDate = sdf.format(date);
		String alert = "<script>alert('this is the time template')</script>";
		model.addAttribute("formattedDate", formattedDate);
		model.addAttribute("alert", alert);
		return "time.jsp";
	}
}
