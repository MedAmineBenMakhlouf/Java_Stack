package com.renderingbook.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.renderingbook.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	List<Book> findAll();
}
