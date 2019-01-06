package com.test.service;

import com.test.bean.Admin;

public interface AdminService {
	
	public void saveAdmin(Admin admin);
    public void updateAdmin(Admin admin);
    public Admin findAdminById(Integer id);
    public Admin checkAdmin(Admin admin);
}
