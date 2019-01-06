package com.test.interceptor;

import com.opensymphony.xwork2.ActionInvocation;

import com.opensymphony.xwork2.interceptor.Interceptor;

public class userlogininterceptor implements Interceptor  {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
      System.out.println("hello destory");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
       System.out.println("hello init");
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
