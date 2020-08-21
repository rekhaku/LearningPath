package com.tech.pandemic.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tech.pandemic.dto.LoginDTO;
import com.tech.pandemic.dto.PersonDTO;
import com.tech.pandemic.dto.UserRegistrationDTO;
import com.tech.pandemic.model.Person;
import com.tech.pandemic.model.User;
import com.tech.pandemic.service.PersonService;
import com.tech.pandemic.service.UserService;

@Controller
public class LoginController {

	private static final Logger logger = LogManager.getLogger(LoginController.class);

	@Autowired
	private UserService userService;

	@Autowired
	private PersonService personService;

	@ModelAttribute("registrationUser")
	public UserRegistrationDTO registrationUser() {
		return new UserRegistrationDTO();
	}

	@ModelAttribute("loginUser")
	public LoginDTO loginUser() {
		return new LoginDTO();
	}

	@RequestMapping(value = "/login", method = { RequestMethod.POST })
	public String login(@ModelAttribute("loginUser") @Valid LoginDTO loginUser, BindingResult result, Model model,
			HttpSession session) throws Exception {
		logger.info("Login Page about to load<<" + loginUser.getUserName() + ">>");
		String forwardPath = "/personDetails";
		try {
			if (result.hasErrors()) {
				System.out.println("1.1");
				for (ObjectError err : result.getAllErrors()) {
					System.out.println(err.toString());
				}
				return "/login";
			}

			User registeredUser = userService.validateLogin(loginUser);
			if (registeredUser != null) {
				try {
					Person personFromRepository = personService.getPersonDetailsByUserName(loginUser.getUserName());
					model.addAttribute("person", personFromRepository);
				} catch (Exception e) {
					model.addAttribute("person", new Person(registeredUser.getUserName()));
				}
				session.setAttribute("loginUser", registeredUser);
			}
			if (!registeredUser.isActiveInd()) {
				forwardPath = "/reactivate";
			}
		} catch (UsernameNotFoundException e) {
			model.addAttribute("error", e.getMessage());
			forwardPath = "/registration";
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
			forwardPath = "login";
		}
		return forwardPath;
	}

	@RequestMapping(value = "/registration", method = { RequestMethod.POST })
	public String registerPersonDetails(@Valid @ModelAttribute("registrationUser") UserRegistrationDTO user,
			BindingResult result, Model model) {
		logger.info("Registration successful page");
		if (result.hasErrors()) {
			for (ObjectError err : result.getAllErrors()) {
				logger.info(err.toString());
			}
			return "/registration";
		}
		try {
			userService.registerUser(user);
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());

		}
		return "/login";
	}

}
