package com.test.action.book;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.test.bean.Book;
import com.test.service.BookService;

public class RemoveBookAction extends ActionSupport{
	   private BookService bookservice;
        private Book book;
	  
	

	   public BookService getBookservice() {
			return bookservice;
		}



		public void setBookservice(BookService bookservice) {
			this.bookservice = bookservice;
			
		}

		public Book getBook() {
			return book;
		}


		public void setBook(Book book) {
			this.book = book;
		}

	@Override
		public String execute() throws Exception
		{
			this.bookservice.removeBook(book);
			return SUCCESS;
		}
}
