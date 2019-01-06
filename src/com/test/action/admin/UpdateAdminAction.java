package com.test.action.admin;

import org.springframework.web.struts.ActionSupport;


import com.test.bean.Admin;
import com.test.service.AdminService;

public class UpdateAdminAction extends ActionSupport{
	 
	private Admin admin;
	 private AdminService adminservice;
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public AdminService getAdminservice() {
		return adminservice;
	}
	public void setAdminservice(AdminService adminservice) {
		this.adminservice = adminservice;
	}
	
	
	
	public String execute() throws Exception
	{
		this.adminservice.updateAdmin(admin);
		
		return "success";
	}
}
