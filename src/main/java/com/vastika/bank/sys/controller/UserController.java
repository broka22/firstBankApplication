package com.vastika.bank.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vastika.bank.sys.service.UserService;

@Controller
public class UserController {
	
//	@Autowired
	private UserService userService;

	@RequestMapping(value = "/")
	public String userLoginForm() {
		return "welcomePage";
	}

	@RequestMapping(value="/user_signUp")
	public String signUp() {
		return "signUp";
	}
	
	@RequestMapping(value="/user_login", method = RequestMethod.POST)
	public String userRegistration() {
		return "accountDetails";
	}
	
	@RequestMapping(value="/user_welcome")
	public String userLoginRedirect() {
		return "welcomePage";
	}
	
	@RequestMapping(value="/user_signOut")
	public String userLogOut() {
		return "logOutPage";
	}
	
}
