package com.bridgeit.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.model.UserRegistration;
import com.bridgeit.service.UserServiceInterface;

@Controller
public class LoginController {
 
	private UserServiceInterface userServiceInterface;
	
	public LoginController(UserServiceInterface userServiceInterface) {
		this.userServiceInterface = userServiceInterface;
	}
	//WellCome Page
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public ModelAndView login(@ModelAttribute("login")UserRegistration userRegistration,HttpServletRequest request) {
		ModelAndView modelAndView=new ModelAndView();
		HttpSession session=request.getSession(false);
		System.out.println(session.getAttribute("Username"));
		System.out.println("hello page "+userRegistration.getUsername());
		modelAndView.addObject("name", session.getAttribute("Username"));
		modelAndView.setViewName("hello");
		return modelAndView;
        //return "hello";
	}
	//
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView loginpage(HttpServletResponse response,ModelAndView modelAndView) {
        modelAndView.setViewName("Login");
        return  modelAndView;
        
	}
	//
	@RequestMapping("/registration")
	public ModelAndView registration() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Registration");
		return mv;
	}
	//Login Action
	@RequestMapping(value="/loginpage")
	public ModelAndView loginuser(@ModelAttribute("login")UserRegistration userRegistration,HttpServletRequest request,HttpServletResponse response) {
		
		ModelAndView modelAndView=new ModelAndView();
		 
		System.out.println("username "+userRegistration.getUsername());
		System.out.println("pass "+userRegistration.getPassword());
		String username=userRegistration.getUsername();
		String pass=userRegistration.getPassword();
		boolean flag=userServiceInterface.getEmailId(username);
		//boolean flag=userServiceInterface.getUserById(pass);
		
		if(flag==true) {
			
			HttpSession httpSession=request.getSession();
			httpSession.setAttribute("Username",userRegistration.getUsername());
			//httpSession.setAttribute("Userbdy",userRegistration.getBdydate());
			//httpSession.setAttribute("UserEmail",userRegistration.getEmail());
			
            Cookie cookie=new Cookie("UserPojo",userRegistration.getPassword());
            response.addCookie(cookie);
            
            modelAndView.addObject("name", userRegistration.getUsername());
            modelAndView.setViewName("hello");
		
		}else {
			modelAndView.addObject("message", "Oops sorry ur Email-id is Wrong");
			modelAndView.setViewName("Login");
		}
	
		return modelAndView;
	}
	//LogOut Action
	@RequestMapping(value="/LogOut", method=RequestMethod.GET)
	public String Logout(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("in logout button");
		
		Cookie ck=new Cookie("UserPojo","");
        ck.setMaxAge(0);
        response.addCookie(ck);
        HttpSession session=request.getSession(false);
        session.removeAttribute("UserPojo");
        session.invalidate();
        
        
        System.out.println("u have logedout successfully");
        return "redirect:/login";
	}
	
}
