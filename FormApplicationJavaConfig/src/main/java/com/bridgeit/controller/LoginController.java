package com.bridgeit.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.dao.UserDAOImp;
import com.bridgeit.model.UserModel;
import com.bridgeit.service.IUserService;

@Controller
public class LoginController {

	@Autowired
	 IUserService userserviceImp;
	
	@RequestMapping("/login")
    public ModelAndView login(ModelAndView model) {
		model.setViewName("Login");
    	return model;
    }
//	
//	
//	//On first Action of LoginButton
//		@RequestMapping(value="/loginpage")
//		public ModelAndView loginuser(@ModelAttribute("login")UserModel user,HttpServletRequest request,HttpServletResponse response) {
//			
//			ModelAndView modelAndView=new ModelAndView();
//			 
//			System.out.println("username "+user.getUserName());
//			System.out.println("pass "+user.getPassWord());
//			String username=user.getUserName();
//			String pass=user.getPassWord();
//			int row=userserviceImp.insertUser(user);
//			//boolean flag=userServiceInterface.getUserById(pass);
//			
//			if(row>0) {
//				
//				HttpSession httpSession=request.getSession();
//				httpSession.setAttribute("Username",user.getUserName());
//				
//	            Cookie cookie=new Cookie("UserPojo",user.getPassWord());
//	            response.addCookie(cookie);
//	            
//	            modelAndView.addObject("name", user.getUserName());
//	            modelAndView.setViewName("hello");
//			
//			}else {
//				modelAndView.addObject("message", "Oops sorry ur Email-id is Wrong");
//				modelAndView.setViewName("Login");
//			}
//		
//			return modelAndView;
//		}
	@RequestMapping("/welcomePage")
     public ModelAndView loginAfterEnterName(ModelAndView model) {
		model.setViewName("Welcome");
    	 return model;
     }
}
