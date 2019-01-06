package com.test.action.book;

import com.opensymphony.xwork2.ActionSupport;
import com.test.bean.Book;
import com.test.service.BookService;

public class UpdatePBook extends ActionSupport{
   
	   private Book book;
	   private BookService bookservice;
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public BookService getBookservice() {
		return bookservice;
	}
	public void setBookservice(BookService bookservice) {
		this.bookservice = bookservice;
	}
	@Override
	public String execute() throws Exception
	{
		this.book = this.bookservice.findBookById(book.getBookid());
		
		return SUCCESS;
	}
	
}
