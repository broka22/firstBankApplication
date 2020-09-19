package com.vastika.bank.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

//	@RequestMapping(value="/", method = RequestMethod.GET)
//	public ModelAndView welcome() {
//		ModelAndView view = new ModelAndView("welcomePage");
//		return view;
//	}

	@RequestMapping(value = "/")
	public String userLoginForm() {
		return "welcomePage";
	}

	@RequestMapping(value="/user_login", method = RequestMethod.POST)
	public String signUp() {
		return null;
	}
	
	
}
