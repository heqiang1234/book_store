package com.test.service.impl;

import java.util.List;

import com.test.bean.Book;
import com.test.dao.BookDAO;
import com.test.service.BookService;

public class BookServiceImpl implements BookService{

	private BookDAO bookDao;
	
	public BookDAO getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDAO bookDao) {
		this.bookDao = bookDao;
	}

	@Override
	public void saveBook(Book book) {
		// TODO Auto-generated method stub
		this.bookDao.saveBook(book);
	}

	@Override
	public List<Book> findAllBooks() {
		// TODO Auto-generated method stub
		return this.bookDao.findAllBooks();
	}

	@Override
	public void removeBook(Book book) {
		// TODO Auto-generated method stub
		this.bookDao.removeBook(book);
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		this.bookDao.updateBook(book);
	}

	@Override
	public Book findBookById(Integer id) {
		// TODO Auto-generated method stub
		return this.bookDao.findBookById(id);
	}

}
