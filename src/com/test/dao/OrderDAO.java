package com.test.dao;

import java.util.List;

import com.test.bean.Book;
import com.test.bean.Order;

public interface  OrderDAO {
 
	public void saveOrder(Order order);
	
	public List<Order> findAllOrders();
	
	public void removeOrder(Order order);
	
	public void updateOrder(Order order);
	
	public List<Order> findOrderById(Integer id);
}
