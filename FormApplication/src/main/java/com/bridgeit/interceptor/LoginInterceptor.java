package com.bridgeit.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		String userName=request.getParameter("");
		String pass=request.getParameter("");
		if(userName!=""&&pass!="") {
			return true;
		}else {
			return false;
		}
	}
}
