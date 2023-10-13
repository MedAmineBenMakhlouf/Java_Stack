package com.bookclub.controllers;

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

import com.bookclub.models.Book;
import com.bookclub.models.User;
import com.bookclub.services.BookService;
import com.bookclub.services.LogRegService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class BookController {

	
	@Autowired
	private LogRegService logregService;
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/book/add")
	public String addBook(@ModelAttribute("book") Book book)
	{
		return "addBook.jsp";
	}
	
	@PostMapping("/book/add")
	public String createBook(@Valid @ModelAttribute("login") Book book, BindingResult result, Model model,
			HttpSession session)
	{
		if(result.hasErrors())
		{
			return "addBook.jsp";
		}
		else
		{			
			User loggedUser = logregService.findUser((Long) session.getAttribute("user_id"));
			
			book.setUser(loggedUser);
			bookService.createBook(book);
			return "redirect:/dashboard";
		}
	}
	
	@GetMapping("/book/{id}/show")
	public String ShowOne(@PathVariable("id") Long id,Model model, HttpSession session)
	{
		User loggedUser = logregService.findUser((Long) session.getAttribute("user_id"));
		Book book = bookService.findOne(id);
		model.addAttribute("loggedUser", loggedUser);
		model.addAttribute("book", book);
		return "showOne.jsp";
	}
	
	@GetMapping("/book/{id}/edit")
	public String ShowOne(@PathVariable("id") Long id,Model model)
	{
		Book book = bookService.findOne(id);
		model.addAttribute("book", book);
		return "edit.jsp";
	}
	
	
	@PutMapping("/book/{id}/edit")
	public String update(@Valid @ModelAttribute("book") Book book, BindingResult result,HttpSession session)
	{
		if(result.hasErrors())
		{
			return "edit.jsp";
		}
		else
		{
			Book oldBook = bookService.findOne(book.getId());
//			Long userID = (Long) session.getAttribute("user_id");
			book.setUser(oldBook.getUser());
//			// fetch the user by id from db
//			User loggedInUser = userServ.findById(userID);
			// set the current user a the author
			book.setUser(oldBook.getUser());
			bookService.updateBook(book);
			return "redirect:/dashboard"; 
		}
	}
	@DeleteMapping("/book/{id}/delete")
	public String deleteTravel(@PathVariable("id") Long id)
	{
		bookService.deleteBook(id);
		return "redirect:/dashboard";
	}
}
