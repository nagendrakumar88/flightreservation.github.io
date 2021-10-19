package com.online.res.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.online.res.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long>{

	@Query("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity ")
	List<Flight> findByCity(@Param("departureCity") String s,@Param("arrivalCity") String a);

	
	
}
