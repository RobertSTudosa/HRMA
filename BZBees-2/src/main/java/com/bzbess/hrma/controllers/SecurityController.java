package com.bzbess.hrma.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bzbess.hrma.dao.PersonRepository;
import com.bzbess.hrma.dao.UserRepository;
import com.bzbess.hrma.entities.Person;
import com.bzbess.hrma.entities.User;
import com.bzbess.hrma.services.PersonService;
import com.bzbess.hrma.services.UserService;

@Controller
@RequestMapping("/login")
public class SecurityController {
	
	
	
	
	
	@GetMapping()
	public String displayLoginForm () {
		
		return "user/login";
	}
	

	
	
	
	

	
}
