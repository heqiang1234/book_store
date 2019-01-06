package com.test.service.impl;

import com.test.bean.Admin;
import com.test.dao.AdminDAO;
import com.test.service.AdminService;

public class AdminServiceImpl  implements AdminService{

	private AdminDAO adminDao;
	
	public AdminDAO getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDAO adminDao) {
		this.adminDao = adminDao;
	}


	public void saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		this.adminDao.saveAdmin(admin);
	}


	public void updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		this.adminDao.updateAdmin(admin);
	}


	public Admin findAdminById(Integer id) {
		// TODO Auto-generated method stub
		return this.adminDao.findAdminById(id);
	}


	public Admin checkAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return this.adminDao.checkAdmin(admin);
	}

}
