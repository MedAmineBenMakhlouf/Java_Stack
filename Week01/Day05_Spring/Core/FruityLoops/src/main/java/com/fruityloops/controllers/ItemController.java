package com.fruityloops.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fruityloops.models.Item;

@Controller
public class ItemController {

	  @RequestMapping("/")
	    public String index(Model model) {
	        
	        ArrayList<Item> fruits = new ArrayList<Item>();
	        fruits.add(new Item("Kiwi", 3.6));
	        fruits.add(new Item("Mango", 2.4));
	        fruits.add(new Item("Goji Berries", 3.0));
	        fruits.add(new Item("Guava", .50));
	        
	        // Add fruits your view model here
	        model.addAttribute("fruits", fruits);
	        
	        return "index.jsp";
	    }
}
