package com.online.res.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.res.dto.ReservatiionRequest;
import com.online.res.entities.Flight;
import com.online.res.entities.Passenger;
import com.online.res.entities.Reservation;
import com.online.res.repository.FlightRepository;
import com.online.res.repository.PassengerRepository;
import com.online.res.repository.ReservationRepository;
import com.online.res.utility.PdfGenerator;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	private PassengerRepository passengerRepo;
	
	@Autowired
	private FlightRepository flightRepo;

	@Autowired
	private ReservationRepository reservationRepo;
	
	@Autowired
	PdfGenerator pdfGenerator;

	@Override
	public Reservation bookFlight(ReservatiionRequest request) {
		
		 String filePath="D:\\Tickets\\tickets\\booking";
		
		Passenger passenger=new Passenger();
		
		passenger.setFirstName(request.getFirstName());
		passenger.setLastname(request.getLastName());
		passenger.setMiddelName(request.getMiddleName());
	    passenger.setEmail(request.getEmail());
	    passenger.setPhone(request.getPhone());
	    
	    this.passengerRepo.save(passenger);
	    
	    long id = request.getId();
	    
	    Optional<Flight> findById = flightRepo.findById(id);
	    Flight flight = findById.get();
	    
	    Reservation reservation=new Reservation();
	    
	    reservation.setFlight(flight);
	    reservation.setPassenger(passenger);
	    reservation.setCheckedIn(false);
	    reservation.setNumberOfBags(0);
	    
	    this.reservationRepo.save(reservation);
	    
	  
	  //  emailUtil.sendItinerary(p.getEmail(),filePath);
	   
		return reservation;
	}

}
