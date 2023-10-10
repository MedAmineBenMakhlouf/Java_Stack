package com.booksapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.booksapi.models.Books;
import com.booksapi.services.BookService;

@Controller
public class BookController {
	
	private final BookService bookService;

	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	@RequestMapping("/books/new")
	public String create()
	{
		return "create.jsp";
	}
	
	@RequestMapping(value="/processBook" ,method = RequestMethod.POST)
	public Books createBook(@RequestParam(value="title") String title,
							@RequestParam(value="description") String description,
							@RequestParam(value="language") String language,
							@RequestParam(value="pages") int pages)
	
	{
		Books b = new Books(title, description, language, pages);
		return bookService.createBook(b);
	}
}
