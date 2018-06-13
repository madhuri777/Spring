package com.bridgeit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.model.UserModel;
import com.bridgeit.service.IUserService;

@Controller
public class Registration {
	
	@Autowired
	 IUserService userService;

	@RequestMapping(value="/registerprocess", method=RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute("regstruser") UserModel user,ModelAndView modelAndView) {
		System.out.println("username "+user.getUsername());
		System.out.println("email "+user.getEmail());
		System.out.println("pss "+user.getPassword());
	    System.out.println("bdy "+user.getBdydate());
	    int row=userService.insertUser(user);
	    System.out.println("in registration controller "+row);
	    if(row==0) {
	    	modelAndView.addObject("messages","Please try another Email-id");
	    	modelAndView.setViewName("Registration");
	    	return modelAndView; 
	    }
	    modelAndView.setViewName("Login");
	    	return modelAndView;
	}
	@RequestMapping("/registration")
	public ModelAndView registration(ModelAndView model) {
		model.setViewName("Registration");
		return model;
	}
}
