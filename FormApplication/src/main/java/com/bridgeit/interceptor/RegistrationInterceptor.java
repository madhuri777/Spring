package com.bridgeit.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class RegistrationInterceptor extends HandlerInterceptorAdapter{

	ModelAndView model=new ModelAndView();
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("inside interceptor");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String repasswd=request.getParameter("repasswd");
		String email=request.getParameter("email");
		String date=request.getParameter("bdydate");
		
		System.out.println("name "+username);
		System.out.println("pass "+password);
        System.out.println("email "+email);
        System.out.println("date "+date);

        if(nameValidation(username)&&emailValidation(email)&&passWordValidation(password, repasswd)&&date!="") {
        	return true;
        }else {
        	//System.out.println("please fill all fields correctly");
        	//response.sendRedirect("registration");
        	model.setViewName("Registration");
        	String message="please fill all fields correctly";
        	model.addObject("message",message);
        	throw new ModelAndViewDefiningException(model);
//        	model.setViewName("Registration");
        	//model=new ModelAndView();
 //          return false;
        }
	}
	
	public boolean nameValidation(String name) {
		String pattern ="[A-Za-z]*";
		if(name.matches(pattern)&&name!="") {
			System.out.println("good u entered all character ");
			return true;
		}else {
			System.out.println("please enter all character in name field");
			return false;
		}
	}
	public boolean emailValidation(String email) {
		String pattern="^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
		if(email!=""&&email.matches(pattern)) {
			System.out.println("good ur email id is right");
			return true;
		}else {
			System.out.println("plese enter valid emailid");
			return false;
		}
	}
	public boolean passWordValidation(String pass,String repass) {

		if(pass!=""&&repass!=""&&pass.equals(repass)) {
			System.out.println("u have enterd corect passwd ");
			return true;
		}else {
			System.out.println("plese enter non empty same length pass word ");
			return false;
		}
	
	}
	
}
