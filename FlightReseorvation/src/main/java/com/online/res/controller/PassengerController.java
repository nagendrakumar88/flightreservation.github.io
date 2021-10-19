package com.online.res.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.online.res.entities.Passenger;
import com.online.res.repository.PassengerRepository;

@Controller
public class PassengerController {
	
	@Autowired
	private PassengerRepository passengerRepo;
	
	//save passenger
	
	@PostMapping("/passengerdetails")
	public String savePassenger(@ModelAttribute("passenger") Passenger passenger) {
		
		this.passengerRepo.save(passenger);
		System.out.println("Passenger Saved..");
		
		return "";
	}

}
