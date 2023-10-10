package com.booksapi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.booksapi.models.Books;

public interface BookRepository extends CrudRepository<Books, Long> {

	List<Books> findAll();
}
