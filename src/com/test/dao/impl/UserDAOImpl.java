package com.test.dao.impl;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.test.bean.User;
import com.test.dao.UserDAO;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO
{
	 private SessionFactory sessionFactory;
	public void saveUser(User user)
	{
		this.getHibernateTemplate().save(user);
	}

	@SuppressWarnings("unchecked")
	public List<User> findAllUsers()
	{
		String hql = "from User user order by user.id desc";

		return (List<User>) this.getHibernateTemplate().find(hql);
	}

	public void removeUser(User user)
	{
		this.getHibernateTemplate().delete(user);
	}

	public void updateUser(User user)
	{
		this.getHibernateTemplate().update(user);
	}

	public User findUserById(Integer id)
	{
		User user = (User) this.getHibernateTemplate().get(User.class, id);

		return user;
	}
	@SuppressWarnings("unchecked")
	 public User checkUser(User user1) {
		// TODO Auto-generated method stub
			String hql = "from User where username = '"+user1.getUsername()+"' and userpassword = '"+user1.getUserpassword()+"'";
			User user = null;
			try{
				
				List<User> userList = this.getHibernateTemplate().find(hql);
				if(userList.size() > 0){
					user = new User();
					user = userList.get(0);
				}
			}catch(RuntimeException re){
				throw re;
			}
			return user;
		}

	}