package com.test.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.test.bean.Book;
import com.test.bean.Order;
import com.test.bean.User;
import com.test.dao.OrderDAO;
import com.test.service.BookService;

public class OrderDAOImpl extends HibernateDaoSupport implements OrderDAO{

	 private SessionFactory sessionFactory;
	 private BookService bookservice;
	public void saveOrder(Order order) {
		// TODO Auto-generated method stub
		
		this.getHibernateTemplate().save(order);
	}

	@SuppressWarnings("unchecked")
	public List<Order> findAllOrders() {
		// TODO Auto-generated method stub
		String hql = "from Order order order by order.id desc";
		List<Order> order =(List<Order>) this.getHibernateTemplate().find(hql);
		return (List<Order>) this.getHibernateTemplate().find(hql);
	}


	public void removeOrder(Order order) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(order);
	}


	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(order);
	}


	public List<Order> findOrderById(Integer id) {
		// TODO Auto-generated method stub
	//	System.out.println(id);
		String hql = "from Order where orderuserid = '"+id+"'";
		return (List<Order>) this.getHibernateTemplate().find(hql);
	}

}
