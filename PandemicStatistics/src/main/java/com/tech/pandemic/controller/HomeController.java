package com.tech.pandemic.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tech.pandemic.dto.LoginDTO;
import com.tech.pandemic.model.User;

@Controller
public class HomeController {

	private static final Logger logger = LogManager.getLogger(HomeController.class);
	
	@ModelAttribute("loginUser")
	public LoginDTO loginUser() {
		return new LoginDTO();
	}
   
	@RequestMapping(value = "/signUp")
	public String signUp() {
		logger.info("sign up page");
		return "/login";
	}
	
	
	
	
}
