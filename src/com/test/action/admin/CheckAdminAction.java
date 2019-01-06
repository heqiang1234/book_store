package com.test.action.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.test.bean.Admin;
import com.test.bean.User;
import com.test.service.AdminService;

public class CheckAdminAction extends ActionSupport{
         
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
	public String loginCheck() throws Exception{
		String page = "fail";
		Admin admin1 = new Admin();
		admin1 = this.adminservice.checkAdmin(admin);
		if(admin1 != null){
			page = "success";
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession session = request.getSession();
			if(session.getAttribute("loginUser") != null){
				session.removeAttribute("loginUser");
			}
			session.setAttribute("loginUser", admin1);
		}
		return page;
	}
}
