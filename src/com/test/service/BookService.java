package com.test.service;

import java.util.List;

import com.test.bean.Book;

public interface BookService {
	
	public void saveBook(Book book);
	
	public List<Book> findAllBooks();
	
	public void removeBook(Book book);
	
	public void updateBook(Book book);
	
	public Book findBookById(Integer id);
}
