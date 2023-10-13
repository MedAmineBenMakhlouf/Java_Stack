package com.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookclub.models.Book;
import com.bookclub.repositories.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getAll()
	{
		return bookRepository.findAll();
	}
	
	public Book createBook(Book l)
	{
		return bookRepository.save(l);
	}
	
	public Book findOne(Long id)
	{
		Optional<Book> OptBook= bookRepository.findById(id);
		if(OptBook.isPresent())
		{
		return OptBook.get();
		}
		else return null;
	}
	
	public Book updateBook(Book l)
	{
		
		return bookRepository.save(l);
	}
	
	public void deleteBook(Long id)
	{
		bookRepository.deleteById(id);
	}
	
}
