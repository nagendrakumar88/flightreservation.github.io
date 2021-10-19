package com.online.res.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.online.res.entities.User;
import com.online.res.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepo;

	@RequestMapping("/")
	public String showRegistration()
	{
		
		return "/login/showRegister";
	}
	
	@RequestMapping("/loginPage")
	public String loginpage()
	{
		return "login/login";
	}

	//save user
	@RequestMapping("/saveReg")
	public String saveRegister(@ModelAttribute("user") User user)
	{
		
		this.userRepo.save(user);
		return "login/login";
	}
	
	//login
	
	@PostMapping("/verifyLogin")
	public String verfyLogin(@RequestParam("email")String email,
			@RequestParam("password")String password,ModelMap modelMap) {
		
		  User user=this.userRepo.findByEmail(email);
		    if(user !=null)
		    {
		   if(user.getEmail().endsWith(email) && user.getPassword().equals(password))
		   {
			  return "findFlights"; 
		   }else 
		   {
			   modelMap.addAttribute("error","Invalid User name and Password");
			   return "login/login";
		   }
		    }else {
		    	
		    	 modelMap.addAttribute("error","Invalid User name and Password");
				   return "login/login";
		    }
		
	}
}
