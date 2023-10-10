package com.renderingbook.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.renderingbook.models.Book;
import com.renderingbook.services.BookService;

@RestController
public class BookAPI {

	private final BookService bookService;

	public BookAPI(BookService bookService) {
		this.bookService = bookService;
	}

	@RequestMapping(value="/api/books",method = RequestMethod.GET)
	public List<Book> findAll()
	{
		return bookService.allBooks();
	}
	
	@RequestMapping(value="/api/books/{id}",method = RequestMethod.GET)
	public Book findOne(@PathVariable("id") Long id)
	{
		Book book = bookService.findBook(id);
		return book;
	}
	
	@RequestMapping(value="/api/books", method = RequestMethod.POST)
	public Book create(@RequestParam("title") String title,
						@RequestParam("description") String description,
						@RequestParam(value = "language") String lang,
						@RequestParam(value = "pages") int numOfPages)
	{
		Book book = new Book(title, description, lang, numOfPages);
		Book b = bookService.createBook(book);
		return b;
	}
}
