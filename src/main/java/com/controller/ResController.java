package com.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Login;
import com.model.Register;
import com.service.UserService;


@Controller
@RequestMapping("/mainapp")
public class ResController {
	@Autowired
	private UserService service;
	

//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	@GetMapping("/login")
//    public String login(Model model) {
//		model.addAttribute("userlogin", new Login());
//		return "login";
//	}
//	
//	@PostMapping("/login")
//	public String loginValid(@ModelAttribute Login login2, BindingResult result, @Valid Login login ) {
//	if(result.hasErrors())	{
//		return "login";
//	}
//	else if(service.userValidation(login)){
//		  
//		}
//	 return "success";	
//	}
//	
////	@RequestMapping(value = "/register", method = RequestMethod.GET)
//	@GetMapping("/register")
//	public String register(Model model) {
//		model.addAttribute("registration", new Register());
//		return "register";
//	}

}
