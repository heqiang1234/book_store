package com.test.action.order;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.test.bean.Order;
import com.test.bean.User;
import com.test.service.OrderService;

public class ListOrderByIdAction extends ActionSupport
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
		HttpServletRequest request1 = ServletActionContext.getRequest();
		HttpSession session = request1.getSession();
		Map request = (Map)ActionContext.getContext().get("request");
		User user = (User)session.getAttribute("loginUser");
		int id=user.getUserid();
		request.put("list", this.orderservice.findOrderById(id));
		return SUCCESS;
	}
}
