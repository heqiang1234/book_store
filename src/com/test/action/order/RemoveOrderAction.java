package com.test.action.order;

import com.opensymphony.xwork2.ActionSupport;
import com.test.bean.Order;
import com.test.service.OrderService;

public class RemoveOrderAction extends ActionSupport{
          
	private Order order;
	private OrderService orderservice;
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
		this.orderservice.removeOrder(order);
		return SUCCESS;
	}
}
