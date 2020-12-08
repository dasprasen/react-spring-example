package com.project.reactspringexample.service.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.project.reactspringexample.model.Book;
import com.project.reactspringexample.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	private Long bookId=100L;
	private Map<Long, Book> bookMap = new HashMap<Long, Book>();
	
	{
		Book book=new Book();
		book.setId(bookId);
		book.setTitle("Spring book");
		book.setAuthor("John Campbell");
		book.setCoverPhotoURL("https://img2.pngio.com/book-digital-ebook-education-electronic-online-read-icon-online-book-png-512_512.png");
		book.setIsbnNumber(1617212129L);
		book.setPrice(2000.00);
		book.setLanguage("English");
		bookMap.put(book.getId(), book);
	}
	
	@Override
	public Collection<Book> findAll() {
		return bookMap.values();
	}

	@Override
	public Book findbyId(Long id) {
		return bookMap.get(id);
	}

	@Override
	public Book save(Book book) {
		Long newBookId = ++bookId;
		book.setId(newBookId);
		bookMap.put(book.getId(), book);
		return bookMap.get(newBookId);
	}

	@Override
	public Book update(Book book) {
		bookId=book.getId();
		if(bookMap.get(bookId) != null) {
			bookMap.put(bookId, book);
			return bookMap.get(bookId);
		}
		return null;
	}

	@Override
	public Book deleteById(Long id) {
		if(bookMap.get(id) != null) {
			return bookMap.remove(id);
		}
		return null;
	}

}
