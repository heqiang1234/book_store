package com.test.bean;

import java.util.Date;

public class Order {
   private int orderid;
   private User users1=new User();
   private Book books1=new Book();

    
public int getOrderid() {
	return orderid;
}


public void setOrderid(int orderid) {
	this.orderid = orderid;
}


public User getUsers1() {
	return users1;
}


public void setUsers1(User users1) {
	this.users1 = users1;
}


public Book getBooks1() {
	return books1;
}


public void setBooks1(Book books1) {
	this.books1 = books1;
}

  
public Order(int orderid, User users1, Book books1) {
	super();
	this.orderid = orderid;
	this.users1 = users1;
	this.books1 = books1;
}


public Order() {
	super();
}
      
}
