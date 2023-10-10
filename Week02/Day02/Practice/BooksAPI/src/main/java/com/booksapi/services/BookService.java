package com.booksapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.booksapi.models.Books;
import com.booksapi.repositories.BookRepository;

@Service
public class BookService {
	 // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Books> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Books createBook(Books b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Books findBook(Long id) {
        Optional<Books> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    public Books updateBook(Books b)
    {
    	
    	return bookRepository.save(b);
    }
    
    public void deleteBook(Long id)
    {
    	bookRepository.deleteById(id);
    }
}
