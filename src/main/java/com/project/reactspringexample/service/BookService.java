package com.project.reactspringexample.service;

import java.util.Collection;

import com.project.reactspringexample.model.Book;

public interface BookService {
	
	Collection<Book> findAll();
	
	Book findbyId(Long id);
	
	Book save(Book book);
	
	Book update(Book book);
	
	Book deleteById(Long id);
}
