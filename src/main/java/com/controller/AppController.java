package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Login;
import com.model.Register;
import com.model.User;
import com.service.UserService;

import io.swagger.annotations.ApiOperation;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/mainapp")
public class AppController {
	
	
	@Autowired
	private UserService service;
	
	
	
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//    @ResponseBody
//	  public String loginValid(@RequestParam("uname")String name, @RequestParam("password")String password) {
//		
//		User user = new User(name, password);
//		if(service.userValidation(user)) {
//			return "user login successful";
//		}
//		return "login failed";
//	}
//     
	
	ArrayList<User> al = new ArrayList<User>();
	
//	@RequestMapping(value = "/register", method = RequestMethod.POST)
//	@ResponseBody
	@PostMapping("/register")
	@ApiOperation(value = "register the user with objects", notes = "provide the user data with all the mandatory values")
	public String Userregister(@RequestBody User user  ) {
		
		service.userRegistered(user);
			return "user added";
		}
		
		
		    		
	
	@GetMapping("/loadall")
	public List<User> loadAll(){
		return service.loadAll();
	}
	
	@GetMapping("/finduser/{name}")
	public String findUser(@PathVariable("name")String name) {
		if(service.findUser(name)) {
			return "user found";
		}
		return "user not found";
	}
	
//	@GetMapping("/login")
//    public String login(Model model) {
//		model.addAttribute("userlogin", new Login());
//		return "login";
//	}
	
	@PostMapping("/login")
	public String loginValid(@RequestBody Login login2) {
	
	if(service.userValidation(login2)){
		return "success";
		}
	 return "unsuccessful";	
	}
	@DeleteMapping("/deleteuser/{name}")
	public String deleteUser(@PathVariable("name")String name) {
		service.deleteUser(name);
		return "user deleted";
	}
	
	@PutMapping("/updateuser/{name}")
	public String updateUser(@RequestBody User user,   @PathVariable("name")String name) {
		service.updateUser(name,  user);
		
		return "user update";
	}
	
	
//	@RequestMapping(value = "/register", method = RequestMethod.GET)
//	@GetMapping("/register")
//	public String register() {
//		return "register";
//	}
	}
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	@ResponseBody
//	@PostMapping("/login")
//	public String loginValid(@Valid Login login2, BindingResult result, @ModelAttribute Login login ) {
//	if(result.hasErrors())	{
//		return "validation error";
//	}
//	else if(service.userValidation(login)){
//		   return "user login successful";
//		}
//		
//		return "login failed";
//		
//	}


