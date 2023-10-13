package com.renderingbook.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.renderingbook.models.Book;
import com.renderingbook.services.BookService;

import jakarta.websocket.server.PathParam;

@Controller
public class BookController {

	private final BookService bookService;

	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	@RequestMapping("/")
	public String index(Model model) {
		List<Book> book = bookService.allBooks();
		model.addAttribute("books", book);
		return "index.jsp";
	}

	@RequestMapping("/books/new")
	public String createBook() {
		return "bookForm.jsp";
	}

	@RequestMapping(value = "/processBook", method = RequestMethod.POST)
	public String createBook( @RequestParam(value = "title") String title,
							@RequestParam(value = "description") String description, 
							@RequestParam(value = "language") String language,
							@RequestParam(value = "pages") int pages)

	{
		Book book = new Book(title, description, language, pages);
		Book b = bookService.createBook(book);
		return "redirect:/";
	}
	@RequestMapping(value="book/show/{id}")
	public String showOne(Model model,@PathVariable("id") Long id)
	{
		Book b = bookService.findBook(id);
		model.addAttribute("book", b);
		return "showOne.jsp";
	}
}
