package com.test.action.book;

import java.util.Map;

import antlr.collections.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.test.bean.Book;
import com.test.service.BookService;

public class ListBookAction extends ActionSupport{
   private BookService bookservice;

public BookService getBookservice() {
	return bookservice;
}

public void setBookservice(BookService bookservice) {
	this.bookservice = bookservice;
}

public String execute() throws Exception
{
	
	Map request = (Map)ActionContext.getContext().get("request");
	
	request.put("list", this.bookservice.findAllBooks());
	return SUCCESS;
}
}
