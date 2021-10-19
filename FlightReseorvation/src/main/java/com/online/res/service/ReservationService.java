package com.online.res.service;


import com.online.res.dto.ReservatiionRequest;
import com.online.res.entities.Reservation;


public interface ReservationService {
	
	Reservation bookFlight(ReservatiionRequest request);
	

}

