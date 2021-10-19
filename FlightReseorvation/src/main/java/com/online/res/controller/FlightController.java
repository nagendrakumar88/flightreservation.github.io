package com.online.res.controller;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.online.res.entities.Flight;
import com.online.res.repository.FlightRepository;

@Controller
public class FlightController {
	
	@Autowired
	private FlightRepository flightRepo;
	
	@RequestMapping("/findFlight")
	public String findFlights(@RequestParam("from") String s,@RequestParam("to")String t,
			@RequestParam("departureDate") @DateTimeFormat(pattern = "yyyy-MM-dd")Date d,ModelMap modelMap) {
		
		
		  List<Flight>  findByCity = this.flightRepo.findByCity(s,t);
		  
		modelMap.addAttribute("flights",findByCity);
		System.out.println(findByCity);
		return "displayFlights";
		
	
	}
	
	//save flights
	@RequestMapping("/newFlight")
	public String flightPage() {
		
		return "insertFlights";
		
	}
	
	
	@PostMapping("/saveflights")
	public String saveFlights(@ModelAttribute("flight") Flight flight,@RequestParam("dateOfDeparture") 
	@DateTimeFormat(pattern = "yyyy-MM-dd")Date dateOfDeparture,@RequestParam("estimatedDepartureTime")
	@DateTimeFormat(pattern = "yyyy-MM-dd")Timestamp estimatedDepartureTime)
	{
		flight.setDateOfDeparture(dateOfDeparture);
		flight.setEstimatedDepartureTime(estimatedDepartureTime);
		this.flightRepo.save(flight);
		return"insertFlight";
	}

	
	//flights details
	
	@RequestMapping("/showCompleteResorvation/{id}")
	public String flightDetails(@PathVariable("id")Long id,ModelMap modelMap) {
		
            Optional<Flight> findById = this.flightRepo.findById(id);
            Flight flight = findById.get();
            modelMap.addAttribute("flights",flight);
           return "showReservation";
	}
}
