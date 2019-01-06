package com.test.action.order;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jxl.write.DateTime;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.test.bean.Book;
import com.test.bean.Order;
import com.test.bean.User;
import com.test.service.BookService;
import com.test.service.OrderService;

public class SaveOrderAction extends ActionSupport{
               
	private Order order;
	private OrderService orderservice;
	private String bookid1;
	private BookService bookservice;
	public String getBookid1() {
		return bookid1;
	}
	public void setBookid1(String bookid1) {
		this.bookid1 = bookid1;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}

	
	public OrderService getOrderservice() {
		return orderservice;
	}
	public void setOrderservice(OrderService orderservice) {
		this.orderservice = orderservice;
	}
	@Override
	public String execute() throws Exception
	{
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
			User user = (User)session.getAttribute("loginUser");
			order.setUsers1(user);
			System.out.println(order.getBooks1().getBookid());
				orderservice.saveOrder(order);	
				return SUCCESS;
		}
}
