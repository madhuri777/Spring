package com.bridgeit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.model.UserRegistration;
import com.bridgeit.service.UserServiceInterface;

@Controller
public class RegistrationController {

	public  RegistrationController(UserServiceInterface userServiceInterface) {
		this.userServiceInterface=userServiceInterface;
	}
	UserServiceInterface userServiceInterface;

	@RequestMapping(value="/registerprocess")
	public ModelAndView addUser(@ModelAttribute("user") UserRegistration userRegistration,ModelAndView modelAndView) {
		//HttpSession httpSession=request.getSession();
		//httpSession.setAttribute("UserPojo",userRegistration);
		System.out.println("username "+userRegistration.getUsername());
		System.out.println("email "+userRegistration.getEmail());
		System.out.println("pss "+userRegistration.getPassword());
	    System.out.println("bdy "+userRegistration.getBdydate());
	    boolean flag=userServiceInterface.getEmailId(userRegistration.getEmail());
	    System.out.println("in registration controller "+flag);
	    if(flag) {
	    	modelAndView.addObject("messages","Please try another Email-id");
	    	modelAndView.setViewName("Registration");
	    	return modelAndView; 
	    }
	    modelAndView.setViewName("Login");
	    //return (flag==true? modelAndView.setViewName("Registration"):modelAndView.setViewName("hello"));
	    	//return "redirect:/login";
//	    }else {
//	    
//	    	modelAndView.setViewName("");
	    	return modelAndView;
//	    }
	   
	    //userServiceInterface.InsertUser(userRegistration);
	    //return "redirect:/login";
	}
}
