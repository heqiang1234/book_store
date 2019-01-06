package com.test.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.test.bean.Admin;
import com.test.bean.User;
import com.test.dao.AdminDAO;

public class AdminDAOImpl extends HibernateDaoSupport implements AdminDAO{

	 private SessionFactory sessionFactory;
	 
	public void saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(admin);
	}


	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(admin);
	}


	public Admin findAdminById(Integer id) {
		// TODO Auto-generated method stub
		Admin admin = (Admin) this.getHibernateTemplate().get(Admin.class, id);

		return admin;
	}

	@SuppressWarnings("unchecked")
	public Admin checkAdmin(Admin admin1) {
		// TODO Auto-generated method stub
		String hql = "from Admin where adminname = '"+admin1.getAdminname()+"' and adminpassword = '"+admin1.getAdminpassword()+"'";
		Admin admin = null;
		try{
			
			List<Admin> adminList = this.getHibernateTemplate().find(hql);
			if(adminList.size() > 0){
				admin = new Admin();
				admin = adminList.get(0);
			}
		}catch(RuntimeException re){
			throw re;
		}
		return admin;
	}
}

