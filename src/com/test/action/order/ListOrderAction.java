package com.test.action.order;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.test.bean.Order;
import com.test.service.OrderService;

public class ListOrderAction extends ActionSupport
{
      private OrderService orderservice;

	public OrderService getOrderservice() {
		return orderservice;
	}

	public void setOrderservice(OrderService orderservice) {
		this.orderservice = orderservice;
	}
	public String execute() throws Exception
	{
		
		Map request = (Map)ActionContext.getContext().get("request");
		
		request.put("list", this.orderservice.findAllOrders());
		List<Order> order=this.orderservice.findAllOrders();
		return SUCCESS;
	}
}
