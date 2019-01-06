package com.test.action.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.test.bean.User;
import com.test.service.UserService;

public class CheckUserAction extends ActionSupport {
	
     private User user;
	
	private UserService service;

	public User getUser()
	{
		return user;
	}

	public void setUser(User user)
	{
		this.user = user;
	}

	public UserService getService()
	{
		return service;
	}

	public void setService(UserService service)
	{
		this.service = service;
	}
	
	public String loginCheck() throws Exception{
		String page = "fail";
		User user1 = new User();
		user1 = this.service.checkUser(user);
		if(user1 != null){
			page = "success";
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession session = request.getSession();
			if(session.getAttribute("loginUser") != null){
				session.removeAttribute("loginUser");
			}
			session.setAttribute("loginUser", user1);
		}
		return page;
	}
}
