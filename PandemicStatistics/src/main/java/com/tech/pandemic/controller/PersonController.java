package com.tech.pandemic.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tech.pandemic.dto.UserRegistrationDTO;
import com.tech.pandemic.model.Person;
import com.tech.pandemic.model.User;
import com.tech.pandemic.service.PersonService;

@Controller
public class PersonController {

	private static final Logger logger = LogManager.getLogger(PersonController.class);

	@Autowired
	private PersonService personService;

	@RequestMapping(value = "/personDetails", method = { RequestMethod.POST })
	public String updatePersonDetails(@Valid @ModelAttribute("person") Person person, BindingResult result, Model model,
			HttpSession session) {
		logger.info("person details Page about to load");
		if (result.hasErrors()) {
			for (ObjectError err : result.getAllErrors()) {
				logger.info(err.toString());
			}
			return "/personDetails";
		}

		User user = (User) session.getAttribute("loginUser");
		String userName = user.getUserName();
		try {
			Person personFromRepository = personService.getPersonDetailsByUserName(userName);
			person.setFirstName(personFromRepository.getFirstName());
			person.setLastName(personFromRepository.getLastName());
			person.setAddress(personFromRepository.getAddress());
			person.setAge(personFromRepository.getAge());
			person.setGender(personFromRepository.getGender());
			model.addAttribute("person", person);
		}

		catch (Exception e) {
			model.addAttribute("person", person);
		}
		person.setEmail(userName);
		try {
			personService.updatePerson(person);
		} catch (Exception e) {
			model.addAttribute("error", e.getMessage());
		}

		return "/personDetails";

	}

}
