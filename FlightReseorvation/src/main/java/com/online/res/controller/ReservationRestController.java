package com.online.res.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.res.dto.ReservationUpdateResquest;
import com.online.res.entities.Reservation;
import com.online.res.repository.ReservationRepository;

@RestController
public class ReservationRestController {
	
	  @Autowired
	  private ReservationRepository reservationRepo;
	  
	
	//fing 
	
	@RequestMapping("/reservation/{id}")
	public Reservation findReservation(@PathVariable("id") Long id) {
		
		
		Optional<Reservation> findById = this.reservationRepo.findById(id);
		Reservation reservation = findById.get();
		return reservation;
	}

	@RequestMapping("/reservation3")
	public Reservation updateReservation(@RequestBody ReservationUpdateResquest resquest) {
		
		Optional<Reservation> findById = this.reservationRepo.findById(resquest.getId());
		
		Reservation reservation = findById.get();
		reservation.setCheckedIn(resquest.isCheckedIn());
		reservation.setNumberOfBags(resquest.getNumberOfBags());
		Reservation reservation2 = this.reservationRepo.save(reservation);
	    
		return reservation2;
		
	}
}
