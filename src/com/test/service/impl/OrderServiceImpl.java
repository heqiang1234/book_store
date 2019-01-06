package com.test.service.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.test.bean.Order;
import com.test.dao.OrderDAO;
import com.test.service.OrderService;

public class OrderServiceImpl implements OrderService{
     
	private OrderDAO orderDao;
	
	public OrderDAO getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDAO orderDao) {
		this.orderDao = orderDao;
	}

	@Override
	public void saveOrder(Order order) {
		// TODO Auto-generated method stub
		this.orderDao.saveOrder(order);
	}

	@Override
	public List<Order> findAllOrders() {
		// TODO Auto-generated method stub
		return this.orderDao.findAllOrders();
	}

	@Override
	public void removeOrder(Order order) {
		// TODO Auto-generated method stub
		this.orderDao.removeOrder(order);
	}

	@Override
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		this.orderDao.updateOrder(order);
	}

	@Override
	public List<Order> findOrderById(Integer id) {
		// TODO Auto-generated method stub
		return this.orderDao.findOrderById(id);
	}

	

}
