package com.online.res.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.online.res.dto.ReservatiionRequest;
import com.online.res.entities.Reservation;
import com.online.res.service.ReservationService;
import com.online.res.utility.PdfGenerator;

@Controller
public class ReservationController {
	
	@Autowired
	private ReservationService reservationservice;
	
	  @RequestMapping("/confirmReservation")
	public String confirmReservation(ReservatiionRequest request,ModelMap modelMap) {
		
		  Reservation reservationId = this.reservationservice.bookFlight(request);
		  modelMap.addAttribute("reservationId",reservationId.getId());
			 return "confirmReservation";
	}

}
