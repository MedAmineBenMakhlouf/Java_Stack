package com.booksapi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.booksapi.models.Books;
import com.booksapi.services.BookService;

@RestController
public class BooksApi {
	private final BookService bookService;

	public BooksApi(BookService bookService) {
		this.bookService = bookService;
	}

	@RequestMapping(value="/api/books" ,method = RequestMethod.POST)
	public Books createBook(@RequestParam(value="title") String title,
							@RequestParam(value="description") String description,
							@RequestParam(value="language") String language,
							@RequestParam(value="pages") int pages)
	
	{
		Books b = new Books(title, description, language, pages);
		return bookService.createBook(b);
	}
	@RequestMapping("/api/books")
	public List<Books> get_All() {
		return bookService.allBooks();
	}

	// other methods removed for brevity
	@RequestMapping(value = "/api/books/{id}", method = RequestMethod.PUT)
	public Books update(@PathVariable("id") Long id, @RequestParam(value = "title") String title,
			@RequestParam(value = "description") String desc, @RequestParam(value = "language") String lang,
			@RequestParam(value = "pages") Integer numOfPages) {
		Books b = new Books(title, desc, lang, numOfPages);
		Books book = bookService.updateBook(b);
		return book;
	}

	@RequestMapping("/api/books/{id}")
	public Books findOne(@PathVariable("id") Long id)
	{
		return bookService.findBook(id);
	}
	@RequestMapping(value = "/api/books/{id}", method = RequestMethod.DELETE)
	public void destroy(@PathVariable("id") Long id) {
		bookService.deleteBook(id);
	}
}
